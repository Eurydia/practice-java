package test.entity.types;

import core.GameStateData;
import core.entity.types.DepotEntity;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DepotEntityTest {

    private DepotEntity mock;
    private GameStateData mockCtx;

    @BeforeEach
    void setUp() {
        mock = new DepotEntity(0, 0);
        mockCtx = new GameStateData(1);
    }

    @Test
    void testCanReceiveItemFromAnywhere() {
        assertTrue(mock.canReceiveItemFrom(null));
    }

    @Test
    void testTickAddsResources() {
        mock.receiveItem();
        mock.tick(mockCtx);
        assertEquals(1, mockCtx.getResources());
    }
}
