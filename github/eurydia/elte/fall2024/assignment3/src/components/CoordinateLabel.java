package components;

import components.theme.Palette;

import javax.swing.*;
import java.awt.*;

public class CoordinateLabel extends JLabel {

    public CoordinateLabel(int x, int y, Font font) {
        super();
        setFont(font);
        setForeground(Palette.PRIMARY_LIGHT);
        setBackground(Palette.PRIMARY_DARK);
        setEnabled(false);
        setOpaque(true);
        setText(x, y);
    }


    public void setText(int x, int y) {
        setText(String.format("(%d,%d)", x, y));
    }
}
