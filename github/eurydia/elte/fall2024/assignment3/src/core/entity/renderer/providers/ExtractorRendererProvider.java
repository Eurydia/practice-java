package core.entity.renderer.providers;

import core.entity.Entity;
import core.entity.renderer.EntityRendererProvider;
import core.entity.types.ExtractorEntity;

public class ExtractorRendererProvider implements EntityRendererProvider {
    private static final int CHAR_COUNT = 7;

    @Override
    public String render(Entity entity) {

        if (!entity.id.equals(ExtractorEntity.ID)) {
            throw new IllegalArgumentException();
        }

        ExtractorEntity e = (ExtractorEntity) entity;

        final float ratio =
                ((float) e.getTicksUntilNextItemGen()) / ((float) e.getTicksToGenItem());
        final int progress = (int) ((1 - ratio) * CHAR_COUNT);
        return String.format("""
                             <html><pre>
                             EXTR
                             %s%s
                             </pre></html>
                             """,
                             "@".repeat(progress),
                             "&gt;".repeat(CHAR_COUNT - progress)
                            );
    }
}
