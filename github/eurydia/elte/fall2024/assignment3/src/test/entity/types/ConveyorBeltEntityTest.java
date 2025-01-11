package test.entity.types;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import core.entity.types.ConveyorBeltEntity;
import core.entity.types.ExtractorEntity;

import static org.junit.jupiter.api.Assertions.*;

class ConveyorBeltEntityTest {

    private ConveyorBeltEntity conveyor;

    @BeforeEach
    void setUp() {
        conveyor = new ConveyorBeltEntity(0, 0, ConveyorBeltEntity.ConveyorBeltOrientation.NORTH);
    }

    @Test
    void testInitializationOrientation() {
        assertEquals(ConveyorBeltEntity.ConveyorBeltOrientation.NORTH, conveyor.getOrientation());
    }

    @Test
    void testInitializationBufferState() {
        assertNotNull(conveyor.getBufferState());
    }

    @Test
    void testReceiveItemLastBuffer() {
        conveyor.receiveItem();
        assertTrue(conveyor.getBufferState().get(4));
    }

    @Test
    void testCanReceiveItemFromNeighbor() {
        assertTrue(conveyor.canReceiveItemFrom(new ExtractorEntity(0, 1)));
    }
}
