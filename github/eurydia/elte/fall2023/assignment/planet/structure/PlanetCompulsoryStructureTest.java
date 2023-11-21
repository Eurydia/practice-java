package github.eurydia.elte.fall2023.assignment.planet.structure;

import static check.CheckThat.Condition.*;

import org.junit.Test;

import check.CheckThat;

public class PlanetCompulsoryStructureTest {
    @Test
    public void testEnum() {
        CheckThat.theEnum("github.eurydia.elte.fall2023.assignment.planet.Planet")
                .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL)
                .hasEnumElements("MERCURY", "VENUS", "EARTH", "MARS", "JUPITER", "SATURN", "URANUS", "NEPTUNE");
    }
}
