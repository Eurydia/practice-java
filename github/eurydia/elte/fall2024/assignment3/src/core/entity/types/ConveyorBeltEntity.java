package core.entity.types;

import core.GameStateData;
import core.entity.Entity;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;

public class ConveyorBeltEntity extends Entity {

    public static final String ID = "conveyor_belt";
    private static final int DEFAULT_BUFFER_SIZE = 5;
    private static final int DEFAULT_TICKS_TO_MOVE_ITEM = 10;
    private final List<Boolean> buffer = new ArrayList<>();
    private final int ticksToMoveItem;
    private final int bufferSize;
    private final ConveyorBeltOrientation orientation;
    private int tickUntilNextItemMove;

    public ConveyorBeltEntity(int x, int y, ConveyorBeltOrientation orientation, int bufferSize, int ticksToMoveItem) {
        super(x, y, ID);

        this.ticksToMoveItem = ticksToMoveItem;
        this.bufferSize = bufferSize;
        this.orientation = orientation;

        this.tickUntilNextItemMove = ticksToMoveItem;

        for (int i = 0; i < bufferSize; i++) {
            buffer.add(false);
        }
    }

    public ConveyorBeltEntity(int x, int y, ConveyorBeltOrientation orientation) {
        this(x, y, orientation, DEFAULT_BUFFER_SIZE, DEFAULT_TICKS_TO_MOVE_ITEM);
    }

    public ConveyorBeltOrientation getOrientation() {
        return orientation;
    }

    public List<Boolean> getBufferState() {
        return new ArrayList<>(buffer);
    }

    @Override
    public boolean canReceiveItemFrom(Entity sender) {
        final int x = sender.getPositionX();
        final int y = sender.getPositionY();
        if (buffer.getLast()) {
            return false;
        }
        return switch (orientation) {
            case NORTH -> y != (this.positionY - 1);
            case SOUTH -> y != (this.positionY + 1);
            case WEST -> x != (this.positionX - 1);
            case EAST -> x != (this.positionX + 1);
        };
    }

    @Override
    public void receiveItem() {
        if (buffer.getLast()) {
            return;
        }
        buffer.set(bufferSize - 1, true);
    }

    @Override
    public void tick(GameStateData ctx) {
        if (tickUntilNextItemMove > 0) {
            tickUntilNextItemMove--;
            return;
        }
        tickUntilNextItemMove = ticksToMoveItem;

        int dx = 0;
        int dy = 0;
        switch (orientation) {
            case WEST:
                dx = -1;
                break;
            case EAST:
                dx = 1;
                break;
            case SOUTH:
                dy = 1;
                break;
            case NORTH:
                dy = -1;
                break;
        }

        var receiver = ctx.getEntityAt(positionX + dx, positionY + dy);
        sendItem(receiver);
        for (int i = 1; i < bufferSize; i++) {
            if (buffer.get(i) && !buffer.get(i - 1)) {
                buffer.set(i - 1, true);
                buffer.set(i, false);
            }
        }
    }

    private void sendItem(Entity dest) {
        if (buffer.getFirst() && dest != null && dest.canReceiveItemFrom(this)) {
            dest.receiveItem();
            buffer.set(0, false);
        }
    }

    @Override
    public Document toDocument() {
        Document repr = new Document("id", ID);
        repr.append("positionX", positionX);
        repr.append("positionY", positionY);
        repr.append("ticksToMoveItem", ticksToMoveItem);
        repr.append("bufferSize", bufferSize);
        repr.append("orientation", orientation);
        return repr;
    }

    public enum ConveyorBeltOrientation {
        NORTH, EAST, SOUTH, WEST
    }
}
