package components;

import components.theme.Palette;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class WorldGrid extends JPanel {
    private final List<List<StyledGridCell>> cells = new ArrayList<>();
    private final int cellWidthPx;
    private final int cellHeightPx;
    private final int boardRadius;
    private final int boardSize;
    private int centerX;
    private int centerY;

    public WorldGrid(int boardRadius, int cellWidth, int cellHeight,
                     Font font) {
        super(null);

        this.boardRadius = boardRadius;
        boardSize = (2 * boardRadius) + 1;
        setBackground(Palette.PRIMARY_DARK);

        final FontMetrics fontMetrics = this.getFontMetrics(font);
        final int charWidth = fontMetrics.stringWidth("A");
        final int lineHeight = fontMetrics.getHeight();
        cellWidthPx = cellWidth * charWidth;
        cellHeightPx = cellHeight * lineHeight;

        for (int y = -boardRadius; y <= boardRadius; y++) {
            List<StyledGridCell> row = new ArrayList<>();
            for (int x = -boardRadius; x <= boardRadius; x++) {
                final StyledGridCell cell = new StyledGridCell(font);
                cell.setBounds((x + boardRadius) * cellWidthPx,
                               (y + boardRadius) * cellHeightPx,
                               cellWidthPx,
                               cellHeightPx);
                add(cell);
                row.add(cell);
            }
            cells.add(row);
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        final int halfCellWidthPx = cellWidthPx / 2;
        final int halfCellHeightPx = cellHeightPx / 2;
        final int offsetScaleX = ((centerX + boardRadius) * cellWidthPx);
        final int offsetScaleY = ((centerY + boardRadius) * cellHeightPx);
        final int offsetX =
                (getWidth() / 2) - offsetScaleX - halfCellWidthPx;
        final int offsetY =
                (getHeight() / 2) - offsetScaleY - halfCellHeightPx;
        g2.translate(offsetX, offsetY);
    }

    public void setCenterX(int value) {
        StyledGridCell prev =
                cells.get(centerY + boardRadius).get(centerX + boardRadius);
        StyledGridCell next =
                cells.get(centerY + boardRadius).get(value + boardRadius);
        prev.setHighlight(false);
        next.setHighlight(true);
        centerX = value;
    }

    public void setCenterY(int value) {
        StyledGridCell prev =
                cells.get(centerY + boardRadius).get(centerX + boardRadius);
        StyledGridCell next =
                cells.get(value + boardRadius).get(centerX + boardRadius);
        prev.setHighlight(false);
        next.setHighlight(true);
        centerY = value;
    }

    public void setContent(List<List<String>> value) {
        if (value.size() != boardSize) {
            throw new IllegalArgumentException();
        }
        for (List<String> row : value) {
            if (row.size() != boardSize) {
                throw new IllegalArgumentException();
            }
        }

        for (int y = 0; y < boardSize; y++) {
            for (int x = 0; x < boardSize; x++) {
                cells.get(y).get(x).setText(value.get(y).get(x));
            }
        }
    }
}
