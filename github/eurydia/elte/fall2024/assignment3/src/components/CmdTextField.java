package components;

import components.theme.Palette;

import javax.swing.*;
import java.awt.*;

public class CmdTextField extends JTextField {

    public CmdTextField(Font font) {
        super();
        setFont(font);
        setForeground(Palette.PRIMARY_LIGHT);
        setBackground(Palette.PRIMARY_DARK);
        setCaretColor(Palette.PRIMARY_LIGHT.darker());
        setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1,
                                                  Palette.PRIMARY_DARK));
        setActive(false);
    }

    public void setActive(boolean value) {

    }

    public void setHighLight(boolean value) {
        Color c = value ? Palette.ACCENT : Palette.PRIMARY_DARK;
        setEnabled(value);
        setFocusable(value);
        setEditable(value);
        setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1,
                                                  c));
    }
}

