package github.eurydia.elte.fall2023.assignment.planet.structure;

import static check.CheckThat.*;
import static check.CheckThat.Condition.*;
import org.junit.jupiter.api.*;
import check.CheckThat;

public class PlanterExtendedStructureTest {
    @BeforeAll
    public static void init() {
        CheckThat.theClass("github.eurydia.elte.fall2023.assignment.planet.plant.Planter")
                .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL);
    }

    @Test
    // @DisabledIf(notApplicable)
    public void constructor02() {
        it.hasConstructor(withArgs("array of int"))
                .thatIs(VISIBLE_TO_ALL);
    }

    @Test
    // @DisabledIf(notApplicable)
    public void constructor03() {
        it.hasConstructor(withArgs("array of int", "planet.Planet"))
                .thatIs(VISIBLE_TO_ALL);
    }

    @Test
    // @DisabledIf(notApplicable)
    public void methodGetPlantCounts() {
        it.hasMethod("getPlantCounts", withNoParams())
                .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL)
                .thatReturns("array of int");
    }

    @Test
    // @DisabledIf(notApplicable)
    public void methodGrowPlantsByDistanceFrom() {
        it.hasMethod("growPlantsByDistanceFrom", withParams("planet.Planet"))
                .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL)
                .thatReturnsNothing();
    }
}
