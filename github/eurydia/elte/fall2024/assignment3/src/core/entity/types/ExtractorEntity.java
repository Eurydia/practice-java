package core.entity.types;

import core.GameStateData;
import core.entity.Entity;
import org.bson.Document;

import java.util.List;

public class ExtractorEntity extends Entity {

    public static final String ID = "extractor";
    private static final int DEFAULT_TICKS_TO_GEN_ITEM = 40;
    private static final int DEFAULT_TICKS_TO_PUSH_ITEM = 10;
    private static final int DEFAULT_STORAGE_SIZE = 5;

    private final int ticksToGenItem;
    private final int ticksToPushItem;
    private final int storageSize;
    private int itemCount = 0;
    private int ticksUntilNextItemGen;
    private int ticksUntilNextItemPush;

    public ExtractorEntity(int x, int y, int ticksToGenItem, int ticksToPushItem, int storageSize) {
        super(x, y, ID);

        if (ticksToGenItem < 1 || ticksToPushItem < 1 || storageSize < 1) {
            throw new IllegalArgumentException();
        }

        this.ticksToGenItem = ticksToGenItem;
        this.ticksToPushItem = ticksToPushItem;
        this.storageSize = storageSize;

        this.ticksUntilNextItemGen = ticksToGenItem;
        this.ticksUntilNextItemPush = ticksToPushItem;
    }

    public ExtractorEntity(int x, int y) {
        this(x, y, DEFAULT_TICKS_TO_GEN_ITEM, DEFAULT_TICKS_TO_PUSH_ITEM, DEFAULT_STORAGE_SIZE);
    }

    @Override
    public boolean canReceiveItemFrom(Entity sender) {
        return false;
    }

    @Override
    public void receiveItem() {
    }

    @Override
    public void tick(GameStateData ctx) {
        updateTickItemGen();
        updateTickItemPush(ctx.getNeighborOf(positionX, positionY));

    }

    private void updateTickItemGen() {
        if (ticksUntilNextItemGen > 0) {
            ticksUntilNextItemGen--;
            return;
        }
        if (itemCount < storageSize) {
            ticksUntilNextItemGen = ticksToGenItem;
            itemCount++;
        }
    }

    private void updateTickItemPush(List<Entity> neighbors) {
        if (ticksUntilNextItemPush > 0) {
            ticksUntilNextItemPush--;
            return;
        }
        if (itemCount < 1) {
            return;
        }
        ticksUntilNextItemPush = ticksToPushItem;
        for (Entity n : neighbors) {
            if (n == null) {
                continue;
            }
            if (n.canReceiveItemFrom(this)) {
                n.receiveItem();
                itemCount--;
                break;
            }
        }
    }

    public int getTicksToGenItem() {
        return ticksToGenItem;
    }

    public int getTicksUntilNextItemGen() {
        return ticksUntilNextItemGen;
    }

    @Override
    public Document toDocument() {
        Document repr = new Document("id", ID);
        repr.append("positionX", positionX);
        repr.append("positionY", positionY);
        repr.append("ticksToGenItem", ticksToGenItem);
        repr.append("ticksToPushItem", ticksToPushItem);
        repr.append("storageSize", storageSize);
        return repr;
    }
}
