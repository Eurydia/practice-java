package elte_2023_fall.assignment.planet.structure;

import static check.CheckThat.*;
import static check.CheckThat.Condition.*;
import org.junit.jupiter.api.*;
import check.CheckThat;

public class PlanterCompulsoryStructureTest {
    @BeforeAll
    public static void init() {
        CheckThat.theClass("elte_2023_fall.assignment.planet.plant.Planter")
                .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL);
    }

    @Test
    public void fieldPlantCounts() {
        it.hasField("plantCounts", ofType("array of int"))
                .thatIs(INSTANCE_LEVEL, MODIFIABLE, VISIBLE_TO_NONE)
                .thatHas(GETTER)
                .thatHasNo(SETTER);
    }

    @Test
    public void fieldPlanterLocation() {
        it.hasField("planterLocation", ofType("elte_2023_fall.assignment.planet.Planet"))
                .thatIs(INSTANCE_LEVEL, MODIFIABLE, VISIBLE_TO_NONE)
                .thatHasNo(GETTER, SETTER);
    }

    @Test
    public void constructor01() {
        it.hasConstructor(withNoArgs())
                .thatIs(VISIBLE_TO_ALL);
    }

    @Test
    public void methodGetPlantCount() {
        it.hasMethod("getPlantCount", withParams("elte_2023_fall.assignment.planet.Planet"))
                .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL)
                .thatReturns("int");
    }

    @Test
    public void methodAddPlant() {
        it.hasMethod("addPlant", withParams("elte_2023_fall.assignment.planet.Planet"))
                .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL)
                .thatReturnsNothing();
    }

    @Test
    public void methodMovePlants() {
        it.hasMethod("movePlants",
                withParams("int", "elte_2023_fall.assignment.planet.Planet", "elte_2023_fall.assignment.planet.Planet"))
                .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL)
                .thatReturnsNothing();
    }
}
