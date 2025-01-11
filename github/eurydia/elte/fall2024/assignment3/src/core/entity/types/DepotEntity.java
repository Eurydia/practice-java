package core.entity.types;

import core.GameStateData;
import core.entity.Entity;
import org.bson.Document;

public class DepotEntity extends Entity {
    public static final String ID = "depot";
    private int resourceCount;

    public DepotEntity(int x, int y) {
        super(x, y, ID);
    }

    @Override
    public boolean canReceiveItemFrom(Entity sender) {
        return true;
    }

    @Override
    public void receiveItem() {
        resourceCount++;
    }

    @Override
    public void tick(GameStateData ctx) {
        ctx.addResources(resourceCount);
        resourceCount = 0;
    }

    @Override
    public Document toDocument() {
        Document repr = new Document("id", ID);
        repr.append("positionX", positionX);
        repr.append("positionY", positionY);
        return repr;
    }
}
