package core.app;

import components.*;
import components.theme.Palette;

import javax.swing.*;
import java.awt.*;

public class AppView extends JPanel {

    private final WorldGrid worldGrid;
    private final CoordinateLabel coordinateLabel;
    private final ResourceLabel resourceLabel;
    private final CmdTextField cmdTextField;
    private final GoalLabel goalLabel;
    private final SaveNameLabel saveNameLabel;

    public AppView(int boardRadius) {

        setBackground(Palette.PRIMARY_DARK);
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(800, 800));

        final Font font = new Font(Font.MONOSPACED, Font.PLAIN, 24);
        worldGrid = new WorldGrid(boardRadius, 7, 7, font);
        add(worldGrid);

        saveNameLabel = new SaveNameLabel("default", font);
        coordinateLabel = new CoordinateLabel(0, 0, font);
        resourceLabel = new ResourceLabel(0, font);
        goalLabel =
                new GoalLabel(500, font);
        cmdTextField = new CmdTextField(font);
        prepareToolbar();
        prepareTopToolbar();
    }

    public GoalLabel getGoalLabel() {
        return goalLabel;
    }

    public WorldGrid getWorldGrid() {
        return worldGrid;
    }

    public SaveNameLabel getSaveNameLabel() {
        return saveNameLabel;
    }

    public CoordinateLabel getCoordinateLabel() {
        return coordinateLabel;
    }

    public ResourceLabel getResourceLabel() {
        return resourceLabel;
    }

    public CmdTextField getCmdTextField() {
        return cmdTextField;
    }

    private void prepareToolbar() {
        goalLabel.setHorizontalAlignment(SwingConstants.CENTER);
        coordinateLabel.setHorizontalAlignment(SwingConstants.RIGHT);

        JPanel toolbar = new JPanel(new GridLayout(1, 3));
        toolbar.setBorder(BorderFactory.createEmptyBorder());

        toolbar.add(resourceLabel);
        toolbar.add(goalLabel);
        toolbar.add(coordinateLabel);

        JPanel outerToolbar = new JPanel(new BorderLayout());
        outerToolbar.setBorder(BorderFactory.createMatteBorder(1, 0, 0, 0,
                                                               Palette.PRIMARY_LIGHT));
        outerToolbar.add(cmdTextField, BorderLayout.PAGE_END);
        outerToolbar.add(toolbar, BorderLayout.CENTER);

        add(outerToolbar, BorderLayout.PAGE_END);
    }

    private void prepareTopToolbar() {
        JPanel toolbar = new JPanel(new BorderLayout());
        toolbar.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0,
                                                          Palette.PRIMARY_LIGHT));
        toolbar.add(saveNameLabel, BorderLayout.CENTER);
        add(toolbar, BorderLayout.PAGE_START);
    }
}
