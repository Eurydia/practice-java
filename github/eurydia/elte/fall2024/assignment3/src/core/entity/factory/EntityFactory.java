package core.entity.factory;

import core.entity.Entity;
import org.bson.Document;

import java.util.HashMap;
import java.util.List;

public class EntityFactory {

    private static HashMap<String, EntityFactoryProvider> REGISTRY =
            new HashMap<>();

    public static void register(String key, EntityFactoryProvider factory) {
        if (REGISTRY.containsKey(key)) {
            throw new IllegalArgumentException();
        }
        REGISTRY.put(key, factory);
    }

    public static Entity fromArgs(String key, List<String> args) {
        if (!REGISTRY.containsKey(key)) {
            throw new IllegalArgumentException();
        }
        return REGISTRY.get(key).fromArgs(args);
    }


    public static Entity fromDocument(String key, Document document) {
        if (!REGISTRY.containsKey(key)) {
            throw new IllegalArgumentException();
        }
        return REGISTRY.get(key).fromDocument(document);
    }

}
