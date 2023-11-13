package github.eurydia.elte.fall2023.assignment.planet.structure;

import static check.CheckThat.Condition.*;

import org.junit.jupiter.api.*;
import check.CheckThat;

public class PlanetCompulsoryStructureTest {
    @Test
    public void testEnum() {
        CheckThat.theEnum("planet.Planet")
                .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL)
                .hasEnumElements("MERCURY", "VENUS", "EARTH", "MARS", "JUPITER", "SATURN", "URANUS", "NEPTUNE");
    }
}
