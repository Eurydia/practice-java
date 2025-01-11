package components;

import components.theme.Palette;

import javax.swing.*;
import java.awt.*;

public class GoalLabel extends JLabel {
    public GoalLabel(int goal, Font font) {
        super();
        setFont(font);
        setForeground(Palette.PRIMARY_LIGHT);
        setBackground(Palette.PRIMARY_DARK);
        setOpaque(true);
        setEnabled(false);
        setText(goal);
    }

    public void setText(int goal) {
        setText(String.format("GOAL: %s", goal < 0 ? "REACHED!" :
                                               String.valueOf(goal)));
    }
}
