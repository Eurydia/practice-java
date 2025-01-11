package components;

import components.theme.Palette;

import javax.swing.*;
import java.awt.*;

public class ResourceLabel extends JLabel {

    public ResourceLabel(int resource, Font font) {
        super();
        setFont(font);
        setForeground(Palette.PRIMARY_LIGHT);
        setBackground(Palette.PRIMARY_DARK);
        setOpaque(true);
        setEnabled(false);
        setText(resource);
    }

    public void setText(int value) {
        setText(String.format("RESOURCES: %d", value));
    }
}
