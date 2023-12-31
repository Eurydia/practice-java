package github.eurydia.elte.fall2023.unit04.music.fan;

import static check.CheckThat.*;
import static check.CheckThat.Condition.*;
import org.junit.jupiter.api.*;
import check.CheckThat;

public class FanStructureTest {
    @BeforeAll
    public static void init() {
        CheckThat.theClass("github.eurydia.elte.fall2023.unit04.music.fan.Fan")
                .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL);
    }

    @Test
    public void fieldName() {
        it.hasField("name", ofType("String"))
                .thatIs(INSTANCE_LEVEL, NOT_MODIFIABLE, VISIBLE_TO_NONE)
                .thatHas(GETTER)
                .thatHasNo(SETTER);
    }

    @Test
    public void fieldFavourite() {
        it.hasField("favourite", ofType("github.eurydia.elte.fall2023.unit04.music.recording.Artist"))
                .thatIs(INSTANCE_LEVEL, NOT_MODIFIABLE, VISIBLE_TO_NONE)
                .thatHas(GETTER)
                .thatHasNo(SETTER);
    }

    @Test
    public void fieldMoneySpent() {
        it.hasField("moneySpent", ofType("int"))
                .thatIs(INSTANCE_LEVEL, MODIFIABLE, VISIBLE_TO_NONE)
                .thatHas(GETTER)
                .thatHasNo(SETTER);
    }

    @Test
    public void constructor() {
        it.hasConstructorWithParams("String", "github.eurydia.elte.fall2023.unit04.music.recording.Artist")
                .thatIs(VISIBLE_TO_ALL);
    }

    @Test
    public void methodBuyMerchandise() {
        it.hasMethodWithParams("buyMerchandise", "int", "array of Fan")
                .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL)
                .thatReturns("int");
    }

    @Test
    public void methodFavesAtSameLabel() {
        it.hasMethodWithParams("favesAtSameLabel", "Fan")
                .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL)
                .thatReturns("boolean");
    }

    @Test
    public void methodToString1() {
        it.hasMethodWithNoParams("toString1")
                .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL)
                .thatReturns("String");
    }

    @Test
    public void methodToString2() {
        it.hasMethodWithNoParams("toString2")
                .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL)
                .thatReturns("String");
    }

    @Test
    public void methodToString3() {
        it.hasMethodWithNoParams("toString3")
                .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL)
                .thatReturns("String");
    }

    @Test
    public void methodToString4() {
        it.hasMethodWithNoParams("toString4")
                .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL)
                .thatReturns("String");
    }
}
