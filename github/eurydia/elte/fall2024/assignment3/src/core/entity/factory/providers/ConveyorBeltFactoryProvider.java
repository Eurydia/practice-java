package core.entity.factory.providers;

import core.entity.Entity;
import core.entity.factory.EntityFactoryProvider;
import core.entity.types.ConveyorBeltEntity;
import org.bson.Document;

import java.util.List;

public class ConveyorBeltFactoryProvider implements EntityFactoryProvider {
    @Override
    public Entity fromArgs(List<String> args) {
        if (args.size() < 3) {
            return null;
        }

        final int x;
        final int y;
        try {
            x = Integer.parseInt(args.removeFirst());
            y = Integer.parseInt(args.removeFirst());
        } catch (NumberFormatException e) {
            return null;
        }

        final String dir = args.removeFirst();
        ConveyorBeltEntity.ConveyorBeltOrientation orientation;
        switch (dir) {
            case "n":
                orientation =
                        ConveyorBeltEntity.ConveyorBeltOrientation.NORTH;
                break;
            case "e":
                orientation =
                        ConveyorBeltEntity.ConveyorBeltOrientation.EAST;
                break;
            case "w":
                orientation =
                        ConveyorBeltEntity.ConveyorBeltOrientation.WEST;
                break;
            case "s":
                orientation =
                        ConveyorBeltEntity.ConveyorBeltOrientation.SOUTH;
                break;
            default:
                return null;
        }
        return new ConveyorBeltEntity(x, y, orientation);
    }

    @Override
    public Entity fromDocument(Document document) {

        List<String> properties = List.of("positionX", "positionY",
                                          "orientation",
                                          "bufferSize",
                                          "ticksToMoveItem");
        if (!document.keySet().containsAll(properties)) {
            return null;
        }
        final int x = document.getInteger("positionX");
        final int y = document.getInteger("positionY");
        final ConveyorBeltEntity.ConveyorBeltOrientation orientation =
                ConveyorBeltEntity.ConveyorBeltOrientation.valueOf(document.getString("orientation"));
        final int ticksToMoveItem = document.getInteger("ticksToMoveItem");
        final int bufferSize = document.getInteger("bufferSize");
        return new ConveyorBeltEntity(x, y, orientation, bufferSize,
                                      ticksToMoveItem);
    }
}
