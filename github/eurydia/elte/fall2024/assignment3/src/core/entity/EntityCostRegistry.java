package core.entity;

import java.util.HashMap;
import java.util.Map;

public class EntityCostRegistry {
    private static final Map<String, Integer> REGISTRY = new HashMap<>();


    public static void register(String key, int cost) {
        if (REGISTRY.containsKey(key)) {
            throw new IllegalArgumentException();
        }
        REGISTRY.put(key, cost);
    }

    public static int getCost(String key) {
        if (!REGISTRY.containsKey(key)) {
            throw new IllegalArgumentException();
        }
        return REGISTRY.get(key);
    }
}
