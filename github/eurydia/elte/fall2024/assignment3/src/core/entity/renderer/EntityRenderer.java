package core.entity.renderer;

import core.entity.Entity;

import java.util.HashMap;
import java.util.Map;

public class EntityRenderer {
    private static final Map<String, EntityRendererProvider> REGISTRY =
            new HashMap<>();

    public static void register(String entityId,
                                EntityRendererProvider entityRendererProvider) {
        if (REGISTRY.containsKey(entityId)) {
            throw new IllegalArgumentException();
        }
        REGISTRY.put(entityId, entityRendererProvider);
    }

    public static String render(Entity entity) {
        if (entity == null) {
            return "";
        }
        if (!REGISTRY.containsKey(entity.id)) {
            throw new IllegalArgumentException();
        }
        return REGISTRY.get(entity.id).render(entity);
    }
}
