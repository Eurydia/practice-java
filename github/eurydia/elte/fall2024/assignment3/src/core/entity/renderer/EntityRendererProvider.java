package core.entity.renderer;

import core.entity.Entity;

@FunctionalInterface
public interface EntityRendererProvider {
    String render(Entity entity);
}
