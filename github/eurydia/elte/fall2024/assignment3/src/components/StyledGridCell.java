package components;

import components.theme.Palette;

import javax.swing.*;
import java.awt.*;

class StyledGridCell extends JLabel {
    public StyledGridCell(Font font) {
        super();
        setFont(font);
        setForeground(Palette.PRIMARY_LIGHT);
        setBackground(Palette.PRIMARY_DARK);
        setVerticalAlignment(SwingConstants.TOP);
        setHorizontalAlignment(SwingConstants.LEFT);
        setOpaque(true);
        setEnabled(false);

        setHighlight(false);
    }

    public void setHighlight(boolean value) {
        final Color color = value ? Color.ORANGE :
                            Palette.PRIMARY_LIGHT;
        final int w = value ? 4 : 1;
        setBorder(BorderFactory.createMatteBorder(w, w, w, w, color));
    }
}