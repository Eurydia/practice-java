package core.entity.factory.providers;

import core.entity.Entity;
import core.entity.factory.EntityFactoryProvider;
import core.entity.types.DepotEntity;
import core.entity.types.ExtractorEntity;
import org.bson.Document;

import java.util.List;

public class ExtractorFactoryProvider implements EntityFactoryProvider {
    @Override
    public Entity fromArgs(List<String> args) {
        if (args.size() < 2) {
            return null;
        }
        try {
            final int x = Integer.parseInt(args.removeFirst());
            final int y = Integer.parseInt(args.removeFirst());
            return new ExtractorEntity(x, y);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    @Override
    public Entity fromDocument(Document document) {
        List<String> properties = List.of("positionX", "positionY",
                                          "ticksToGenItem",
                                          "ticksToPushItem",
                                          "storageSize");
        if (!document.keySet().containsAll(properties)) {
            return null;
        }
        final int x = document.getInteger("positionX");
        final int y = document.getInteger("positionY");
        final int ticksToGenItem = document.getInteger("ticksToGenItem");
        final int ticksToPushItem = document.getInteger("ticksToPushItem");
        final int storageSize = document.getInteger("storageSize");

        return new ExtractorEntity(x, y, ticksToGenItem, ticksToPushItem,
                                   storageSize);
    }
}
