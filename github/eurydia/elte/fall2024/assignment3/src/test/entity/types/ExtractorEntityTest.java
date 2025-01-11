package test.entity.types;

import core.GameStateData;
import core.entity.types.ExtractorEntity;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class ExtractorEntityTest {

    private ExtractorEntity extractor;
    private GameStateData mockCtx;

    @BeforeEach
    void setUp() {
        extractor = new ExtractorEntity(0, 0);
        mockCtx = new GameStateData(1);
    }

    @Test
    void testInitializationTicksToGenItem() {
        assertEquals(40, extractor.getTicksToGenItem());
    }

    @Test
    void testInitializationPositionX() {
        assertEquals(0, extractor.getPositionX());
    }

    @Test
    void testInitializationPositionY() {
        assertEquals(0, extractor.getPositionY());
    }

    @Test
    void testTickDecrementsTicksUntilNextItemGen() {
        extractor.tick(mockCtx);
        assertEquals(39, extractor.getTicksUntilNextItemGen());
    }

    @Test
    void testCannotReceiveItemFrom() {
        assertFalse(extractor.canReceiveItemFrom(null));
    }
}
