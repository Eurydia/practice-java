package github.eurydia.elte.fall2023.assignment.planet.structure;

import static check.CheckThat.*;
import static check.CheckThat.Condition.*;
import org.junit.jupiter.api.*;

import check.CheckThat;

public class PlanterCompulsoryStructureTest {
    @BeforeAll
    public static void init() {
        CheckThat.theClass("github.eurydia.elte.fall2023.assignment.planet.plant.Planter")
                .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL);
    }

    @Test
    // @DisabledIf(notApplicable)
    public void fieldPlantCounts() {
        it.hasField("plantCounts", ofType("array of int"))
                .thatIs(INSTANCE_LEVEL, MODIFIABLE, VISIBLE_TO_NONE)
                .thatHas(GETTER)
                .thatHasNo(SETTER);
    }

    @Test
    // @DisabledIf(notApplicable)
    public void fieldPlanterLocation() {
        it.hasField("planterLocation", ofType("planet.Planet"))
                .thatIs(INSTANCE_LEVEL, MODIFIABLE, VISIBLE_TO_NONE)
                .thatHasNo(GETTER, SETTER);
    }

    @Test
    // @DisabledIf(notApplicable)
    public void constructor01() {
        it.hasConstructor(withNoArgs())
                .thatIs(VISIBLE_TO_ALL);
    }

    @Test
    // @DisabledIf(notApplicable)
    public void methodGetPlantCount() {
        it.hasMethod("getPlantCount", withParams("planet.Planet"))
                .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL)
                .thatReturns("int");
    }

    @Test
    // @DisabledIf(notApplicable)
    public void methodAddPlant() {
        it.hasMethod("addPlant", withParams("planet.Planet"))
                .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL)
                .thatReturnsNothing();
    }

    @Test
    // @DisabledIf(notApplicable)
    public void methodGrowPlants() {
        it.hasMethod("growPlants", withNoParams())
                .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL)
                .thatReturnsNothing();
    }

    @Test
    // @DisabledIf(notApplicable)
    public void methodMovePlants() {
        it.hasMethod("movePlants", withParams("int", "planet.Planet", "planet.Planet"))
                .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL)
                .thatReturnsNothing();
    }
}
