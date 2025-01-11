package core.entity.renderer.providers;

import core.entity.Entity;
import core.entity.renderer.EntityRendererProvider;
import core.entity.types.DepotEntity;

public class DepotEntityRendererProvider implements EntityRendererProvider {
    @Override
    public String render(Entity entity) {
        if (!entity.id.equals(DepotEntity.ID)) {
            throw new IllegalArgumentException();
        }
        return """
               <html><pre>
               DEPOT
               =======
               </pre></html>
               """;
    }
}
