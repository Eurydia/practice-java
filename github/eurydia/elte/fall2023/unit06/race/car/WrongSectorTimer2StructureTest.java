package github.eurydia.elte.fall2023.unit06.race.car;

import static check.CheckThat.*;
import static check.CheckThat.Condition.*;
import org.junit.jupiter.api.*;
import check.CheckThat;

public class WrongSectorTimer2StructureTest {
    @BeforeAll
    public static void init() {
        CheckThat.theClass("github.eurydia.elte.fall2023.unit06.race.car.WrongSectorTimer2")
                .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL);
    }

    @Test
    public void fieldSectorTimes() {
        it.hasField("sectorTimes", ofType("array of int"))
                .thatIs(INSTANCE_LEVEL, MODIFIABLE, VISIBLE_TO_NONE)
                .thatHas(GETTER, SETTER);
    }

    @Test
    public void constructor() {
        it.hasConstructorWithParams("array of int")
                .thatIs(VISIBLE_TO_ALL);
    }

    @Test
    public void methodGetLapTime() {
        it.hasMethodWithParams("getLapTime", "int")
                .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL)
                .thatReturns("int");
    }

    @Test
    public void methodGetSectorTime() {
        it.hasMethodWithParams("getSectorTime", "int")
                .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL)
                .thatReturns("int");
    }
}
