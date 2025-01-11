package core;

import core.entity.Entity;
import core.entity.EntityCostRegistry;
import core.entity.factory.EntityFactory;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class GameStateData {
    private final List<List<Entity>> entities = new ArrayList<>();
    private final int boardRadius;
    private int resources;
    private boolean isTickPaused = false;

    public GameStateData(int boardRadius) {
        this.boardRadius = boardRadius;
        resources = 125;
        for (int y = -boardRadius; y <= boardRadius; y++) {
            List<Entity> row = new ArrayList<>();
            for (int x = -boardRadius; x <= boardRadius; x++) {
                row.add(null);
            }
            entities.add(row);
        }
    }

    public GameStateData(Document document) {
        Set<String> keySet = document.keySet();
        List<String> properties = List.of("boardRadius", "entities",
                                          "resources");
        if (!keySet.containsAll(properties)) {
            throw new IllegalArgumentException();
        }

        boardRadius = document.getInteger("boardRadius");
        resources = document.getInteger("resources");

        List<?> loadedEntities = document.get("entities", ArrayList.class);
        for (var loadedRow : loadedEntities) {
            List<Entity> entityRow = new ArrayList<>();
            for (var entity : (List<?>) loadedRow) {
                var doc = (Document) entity;
                if (entity == null || !doc.containsKey("id")) {
                    entityRow.add(null);
                } else {
                    entityRow.add(EntityFactory.fromDocument(doc.getString("id"), doc));
                }
            }
            entities.add(entityRow);
        }
    }

    public List<List<Entity>> getEntities() {
        List<List<Entity>> tmp = new ArrayList<>();
        for (List<Entity> row : entities) {
            tmp.add(new ArrayList<>(row));
        }
        return tmp;
    }

    public void setEntity(Entity entity) {
        final int x = entity.getPositionX();
        final int y = entity.getPositionY();
        if (!isCoordinateInRadius(x, y)) {
            throw new IllegalArgumentException();
        }
        entities.get(y + boardRadius).set(x + boardRadius, entity);
    }

    public void removeEntityAt(int x, int y) {
        if (!isCoordinateInRadius(x, y)) {
            throw new IllegalArgumentException();
        }
        entities.get(y + boardRadius).set(x + boardRadius, null);
    }

    public Entity getEntityAt(int x, int y) {
        if (!isCoordinateInRadius(x, y)) {
            throw new IllegalArgumentException();
        }
        return entities.get(y + boardRadius).get(x + boardRadius);
    }

    public List<Entity> getNeighborOf(int x, int y) {
        if (!isCoordinateInRadius(x, y)) {
            throw new IllegalArgumentException();
        }
        List<Entity> neighbors = new ArrayList<>();
        int[] ds = new int[]{-1, 1};
        for (int dx : ds) {
            if (isCoordinateInRadius(x + dx, y)) {
                neighbors.add(getEntityAt(x + dx, y));
            }
        }
        for (int dy : ds) {
            if (isCoordinateInRadius(x, y + dy)) {
                neighbors.add(getEntityAt(x, y + dy));
            }
        }
        return neighbors;
    }

    public int getResources() {
        return resources;
    }

    public void addResources(int value) {
        if (value < 0) {
            throw new IllegalArgumentException();
        }
        resources += value;
    }

    public void consumeResources(int value) {
        if (value < 1) {
            throw new IllegalArgumentException();
        }
        resources -= value;
    }

    public int getBoardRadius() {
        return boardRadius;
    }

    private boolean isCoordinateInRadius(int x, int y) {
        return (-boardRadius <= x && x <= boardRadius) && (-boardRadius <= y && y <= boardRadius);
    }

    public Document toDocument() {
        List<List<Document>> entityRepr = new ArrayList<>();
        for (var row : entities) {
            List<Document> rowRepr = new ArrayList<>();
            for (var entity : row) {
                rowRepr.add(entity == null ? null : entity.toDocument());
            }
            entityRepr.add(rowRepr);
        }

        Document repr = new Document();
        repr.append("boardRadius", boardRadius);
        repr.append("resources", resources);
        repr.append("entities", entityRepr);
        return repr;
    }

    public boolean isTickPaused() {
        return isTickPaused;
    }

    public void setTickPaused(boolean tickPaused) {
        isTickPaused = tickPaused;
    }
}
