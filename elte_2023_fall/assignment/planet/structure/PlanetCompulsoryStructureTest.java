package elte_2023_fall.assignment.planet.structure;

import static check.CheckThat.*;
import static check.CheckThat.Condition.*;
import org.junit.jupiter.api.*;
import check.CheckThat;

public class PlanetCompulsoryStructureTest {
    @Test
    public void testEnum() {
        CheckThat.theEnum("elte_2023_fall.assignment.planet.Planet")
                .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL)
                .hasEnumElements("MERCURY", "VENUS", "EARTH", "MARS", "JUPITER", "SATURN",
                        "URANUS", "NEPTUNE");
    }
}
