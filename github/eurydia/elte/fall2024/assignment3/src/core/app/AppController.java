package core.app;

import core.CameraState;
import core.GameStateData;
import core.SaveFileMetadata;
import core.command.CommandExecutor;
import core.database.DatabaseService;
import core.entity.Entity;
import core.entity.EntityCostRegistry;
import core.entity.factory.EntityFactory;
import core.entity.renderer.EntityRenderer;
import core.entity.types.ConveyorBeltEntity;
import core.entity.types.DepotEntity;
import core.entity.types.ExtractorEntity;
import org.bson.Document;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

public class AppController {
    private static final int DEFAULT_GOAL = 500;
    private static final int DEFAULT_BOARD_RADIUS = 8;
    private static final DatabaseService databaseService = new DatabaseService(
            "mongodb://localhost:27017", "proxima", "game_saves");
    private final AppView view;
    private final CameraState cameraState;
    private GameStateData gameStateData;
    private SaveFileMetadata saveFileMetadata;

    public AppController() {
        Document document = databaseService.getDefaultGameSave();
        if (document != null) {
            saveFileMetadata = new SaveFileMetadata(document.get("metadata",
                                                                 Document.class));
            gameStateData = new GameStateData(document.get("gameStateData",
                                                           Document.class));
        } else {
            saveFileMetadata = new SaveFileMetadata();
            gameStateData = new GameStateData(DEFAULT_BOARD_RADIUS);
        }
        cameraState = new CameraState();
        view = new AppView(gameStateData.getBoardRadius());
        prepareView();
    }

    public AppView getView() {
        return view;
    }

    private void prepareView() {
        view.addKeyListener(new MovementKeyHandler());
        view.addKeyListener(new EntityPlacementShortKeyHandler());
        view.addKeyListener(new TextFieldFocusRequestHandler());

        view.getCmdTextField().addKeyListener(new TextFieldFocusDismissHandler());
        view.getCmdTextField().addActionListener(new TextFieldSubmitHandler());
    }

    public void tick() {
        CommandExecutor.execute();
        if (!gameStateData.isTickPaused()) {
            tickEntities();
        }
        redraw();
    }

    private void redraw() {
        List<List<String>> content = new ArrayList<>();
        List<List<Entity>> entities = gameStateData.getEntities();
        for (var row : entities) {
            List<String> contentRow = new ArrayList<>();
            for (var entity : row) {
                contentRow.add(EntityRenderer.render(entity));
            }
            content.add(contentRow);
        }
        view.getWorldGrid().setContent(content);
        view.getWorldGrid().repaint();
        view.getResourceLabel().setText(gameStateData.getResources());
        view.getSaveNameLabel().setText(saveFileMetadata.getSaveName());
        view.getGoalLabel().setText(saveFileMetadata.hasReachedGoal() ? -1 :
                                    DEFAULT_GOAL);
    }

    private void tickEntities() {
        List<List<Entity>> entities = gameStateData.getEntities();
        for (List<Entity> row : entities) {
            for (Entity entity : row) {
                if (entity != null) {
                    entity.tick(gameStateData);
                }
            }
        }
        if (gameStateData.getResources() >= DEFAULT_GOAL && !saveFileMetadata.hasReachedGoal()) {
            saveFileMetadata.setGoalReached();
        }
    }


    private class TextFieldSubmitHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            final List<String> stringList = List.of(e.getActionCommand().split(
                    " "));

            final ArrayList<String> args =
                    new ArrayList<>(stringList);
            System.out.println(args);

            String cmd = args.removeFirst();
            switch (cmd) {
                case "mk":
                    CommandExecutor.add(() -> {
                        placeTile(args);
                    });
                    break;
                case "rm":
                    CommandExecutor.add(() -> {
                        removeTile(args);
                    });
                    break;
                case "p":
                case "pause":
                    CommandExecutor.add(() -> {
                        gameStateData.setTickPaused(true);
                    });
                    break;
                case "r":
                case "resume":
                    CommandExecutor.add(() -> {
                        gameStateData.setTickPaused(false);
                    });
                    break;
                case "s":
                case "save":
                    CommandExecutor.add(() -> {
                        upsertGameSave(args);
                    });
                    break;
                case "l":
                case "load":
                    CommandExecutor.add(() -> {
                        loadGameSave(args);
                    });
                    break;
                case "n":
                case "new":
                    CommandExecutor.add(() -> {
                        startNewSave(args);
                    });
                    break;
            }
            view.getCmdTextField().setText("");
        }

        private void removeTile(List<String> args) {
            if (args.size() < 2) {
                return;
            }
            try {
                final int x = Integer.parseInt(args.removeFirst());
                final int y = Integer.parseInt(args.removeFirst());
                gameStateData.removeEntityAt(x, y);
            } catch (NumberFormatException _) {
                return;
            }
        }

        private void placeTile(List<String> args) {
            if (args.isEmpty()) {
                return;
            }
            final String entityType = args.removeFirst();
            Entity entity = switch (entityType) {
                case "ex" -> EntityFactory.fromArgs(ExtractorEntity.ID, args);
                case "dp" -> EntityFactory.fromArgs(DepotEntity.ID, args);
                case "cb" ->
                        EntityFactory.fromArgs(ConveyorBeltEntity.ID, args);
                default -> null;
            };
            if (entity == null) {
                return;
            }
            final int cost = EntityCostRegistry.getCost(entity.id);
            if (gameStateData.getResources() < cost) {
                return;
            }
            gameStateData.consumeResources(cost);
            gameStateData.setEntity(entity);
        }

        private void loadGameSave(List<String> args) {
            final String saveName = !args.isEmpty() ? args.removeFirst() : "default";
            Document document = databaseService.getGameSave(saveName);
            if (document == null) {
                return;
            }
            saveFileMetadata = new SaveFileMetadata(document.get("metadata",
                                                                 Document.class));
            gameStateData = new GameStateData(document.get("gameStateData",
                                                           Document.class));
            CommandExecutor.clear();
        }

        private void startNewSave(List<String> args) {
            if (args.isEmpty()) {
                return;
            }
            final String saveName = args.removeFirst();
            saveFileMetadata = new SaveFileMetadata();
            gameStateData = new GameStateData(DEFAULT_BOARD_RADIUS);
            databaseService.upsertGameSave(saveFileMetadata, gameStateData);
            CommandExecutor.clear();
        }

        private void upsertGameSave(List<String> args) {
            final String saveName = args.isEmpty() ? "default" :
                                    args.removeFirst();
            saveFileMetadata.setSaveName(saveName);
            databaseService.upsertGameSave(saveFileMetadata, gameStateData);
        }
    }


    private class TextFieldFocusRequestHandler extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                view.getCmdTextField().setHighLight(true);
                view.getCmdTextField().requestFocusInWindow();
            }
        }
    }

    private class TextFieldFocusDismissHandler extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
                view.getCmdTextField().setHighLight(false);
                view.requestFocusInWindow();
            }
        }
    }

    private class MovementKeyHandler extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            int step = e.isShiftDown() ? 5 : 1;
            int x = cameraState.getCenterX();
            int y = cameraState.getCenterY();
            switch (e.getKeyCode()) {
                case KeyEvent.VK_UP:
                    y -= step;
                    break;
                case KeyEvent.VK_DOWN:
                    y += step;
                    break;
                case KeyEvent.VK_LEFT:
                    x -= step;
                    break;
                case KeyEvent.VK_RIGHT:
                    x += step;
                    break;
                default:
                    return;
            }
            final int br = gameStateData.getBoardRadius();
            final int nextX = Math.clamp(x, -br, br);
            final int nextY = Math.clamp(y, -br, br);
            cameraState.setCenterX(nextX);
            cameraState.setCenterY(nextY);
            view.getCoordinateLabel().setText(nextX, nextY);
            view.getWorldGrid().setCenterX(nextX);
            view.getWorldGrid().setCenterY(nextY);
            view.getWorldGrid().repaint();
        }
    }

    private class EntityPlacementShortKeyHandler extends KeyAdapter {
        private final List<Integer> args = new ArrayList<>();

        @Override
        public void keyPressed(KeyEvent e) {
            String entityKind;
            List<String> factoryArgs = new ArrayList<>();

            factoryArgs.add(String.valueOf(cameraState.getCenterX()));
            factoryArgs.add(String.valueOf(cameraState.getCenterY()));

            if (args.isEmpty()) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_1:
                        entityKind = ExtractorEntity.ID;
                        break;
                    case KeyEvent.VK_3:
                        entityKind = DepotEntity.ID;
                        break;
                    case KeyEvent.VK_2:
                        args.add(KeyEvent.VK_2);
                        return;
                    default:
                        return;
                }
            } else {
                entityKind = ConveyorBeltEntity.ID;
                args.clear();
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_1:
                        factoryArgs.add("n");
                        break;
                    case KeyEvent.VK_3:
                        factoryArgs.add("s");
                        break;
                    case KeyEvent.VK_4:
                        factoryArgs.add("w");
                        break;
                    case KeyEvent.VK_2:
                        factoryArgs.add("e");
                        break;
                    default:
                        return;
                }
            }
            Entity entity = EntityFactory.fromArgs(entityKind, factoryArgs);
            if (entity == null) {
                return;
            }
            CommandExecutor.add(() -> {
                final int cost = EntityCostRegistry.getCost(entity.id);
                if (gameStateData.getResources() < cost) {
                    return;
                }
                gameStateData.consumeResources(cost);
                gameStateData.setEntity(entity);
            });
        }
    }
}
