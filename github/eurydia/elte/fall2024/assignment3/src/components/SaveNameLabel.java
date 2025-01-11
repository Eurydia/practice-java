package components;

import components.theme.Palette;

import javax.swing.*;
import java.awt.*;

public class SaveNameLabel extends JLabel {
    public SaveNameLabel
            (String saveName, Font font) {
        super(saveName);
        setFont(font);
        setForeground(Palette.PRIMARY_LIGHT);
        setBackground(Palette.PRIMARY_DARK);
        setOpaque(true);
        setEnabled(false);

    }
}