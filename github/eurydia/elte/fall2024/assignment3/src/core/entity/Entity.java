package core.entity;

import core.GameStateData;
import org.bson.Document;

public abstract class Entity {

    public final String id;
    protected final int positionX;
    protected final int positionY;

    public Entity(int positionX, int positionY, String id) {
        this.id = id;
        this.positionY = positionY;
        this.positionX = positionX;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public abstract boolean canReceiveItemFrom(Entity sender);

    public abstract void receiveItem();

    public abstract void tick(GameStateData ctx);

    public abstract Document toDocument();

}
