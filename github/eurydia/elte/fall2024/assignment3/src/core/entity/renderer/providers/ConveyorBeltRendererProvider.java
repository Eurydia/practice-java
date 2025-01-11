package core.entity.renderer.providers;

import core.entity.Entity;
import core.entity.renderer.EntityRendererProvider;
import core.entity.types.ConveyorBeltEntity;

public class ConveyorBeltRendererProvider implements EntityRendererProvider {

    @Override
    public String render(Entity entity) {
        if (!entity.id.equals(ConveyorBeltEntity.ID)) {
            throw new IllegalArgumentException();
        }
        ConveyorBeltEntity e = (ConveyorBeltEntity) entity;
        var bufferState = e.getBufferState();
        var orientation = e.getOrientation();

        if (orientation == ConveyorBeltEntity.ConveyorBeltOrientation.WEST || orientation == ConveyorBeltEntity.ConveyorBeltOrientation.EAST) {
            if (orientation ==
                        ConveyorBeltEntity.ConveyorBeltOrientation.EAST) {
                bufferState = bufferState.reversed();
            }
            StringBuilder repr = new StringBuilder();
            repr.append("-------\n");
            repr.append(orientation ==
                                ConveyorBeltEntity.ConveyorBeltOrientation.WEST ? "&lt;" : "&gt;");
            for (var state : bufferState) {
                repr.append(state ? "1" : "-");
            }
            repr.append(orientation ==
                                ConveyorBeltEntity.ConveyorBeltOrientation.WEST ? "&lt;" : "&gt;");
            repr.append("\n");
            repr.append("-------");
            return String.format("""
                                 <html><pre>
                                 %s
                                 </pre></html>
                                 """,
                                 repr);
        }

        StringBuilder repr = new StringBuilder();
        if (orientation == ConveyorBeltEntity.ConveyorBeltOrientation.SOUTH) {
            bufferState = bufferState.reversed();
        }
        repr.append(String.format("|  %c  |\n",
                                  orientation == ConveyorBeltEntity.ConveyorBeltOrientation.SOUTH ? 'V' : '^'));
        for (var state : bufferState) {
            repr.append(state ? "|  1  |;" : "|  |  |");
            repr.append("\n");
        }
        repr.append(String.format("|  %c  |\n",
                                  orientation == ConveyorBeltEntity.ConveyorBeltOrientation.SOUTH ? 'V' : '^'));
        return String.format("""
                             <html><pre>
                             %s
                             </pre></html>
                             """,
                             repr);
    }
}
