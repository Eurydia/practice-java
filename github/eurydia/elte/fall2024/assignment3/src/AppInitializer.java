import core.entity.EntityCostRegistry;
import core.entity.factory.EntityFactory;
import core.entity.factory.providers.ConveyorBeltFactoryProvider;
import core.entity.factory.providers.DepotFactoryProvider;
import core.entity.factory.providers.ExtractorFactoryProvider;
import core.entity.renderer.EntityRenderer;
import core.entity.renderer.providers.ConveyorBeltRendererProvider;
import core.entity.renderer.providers.DepotEntityRendererProvider;
import core.entity.renderer.providers.ExtractorRendererProvider;
import core.entity.types.ConveyorBeltEntity;
import core.entity.types.DepotEntity;
import core.entity.types.ExtractorEntity;

public class AppInitializer {

    public static void initialize() {
        prepareEntityRenderer();
        prepareEntityFactory();
        prepareEntityCost();
    }

    private static void prepareEntityRenderer() {
        EntityRenderer.register(ConveyorBeltEntity.ID,
                                new ConveyorBeltRendererProvider());
        EntityRenderer.register(DepotEntity.ID, new DepotEntityRendererProvider());
        EntityRenderer.register(ExtractorEntity.ID, new ExtractorRendererProvider());
    }

    private static void prepareEntityFactory() {
        EntityFactory.register(ConveyorBeltEntity.ID, new ConveyorBeltFactoryProvider());
        EntityFactory.register(DepotEntity.ID, new DepotFactoryProvider());
        EntityFactory.register(ExtractorEntity.ID, new ExtractorFactoryProvider());
    }

    private static void prepareEntityCost() {
        EntityCostRegistry.register(ConveyorBeltEntity.ID, 5);
        EntityCostRegistry.register(ExtractorEntity.ID, 25);
        EntityCostRegistry.register(DepotEntity.ID, 50);

    }
}
