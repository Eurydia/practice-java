package github.eurydia.elte.fall2023.unit08.text.util;

import static check.CheckThat.*;
import static check.CheckThat.Condition.*;
import org.junit.jupiter.api.*;
import check.CheckThat;

public class CharacterStatisticsStructureTest {
    @BeforeAll
    public static void init() {
        CheckThat.theClass("github.eurydia.elte.fall2023.unit08.text.util.CharacterStatistics")
                .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL)
                .thatHas(TEXTUAL_REPRESENTATION);
    }

    @Test
    public void constructor() {
        it.hasConstructorWithParams("String")
                .thatIs(VISIBLE_TO_ALL);
    }

    @Test
    public void fieldCharToCount() {
        it.hasField("charToCount", ofType("HashMap of Character to Integer"))
                .thatIs(INSTANCE_LEVEL, MODIFIABLE, VISIBLE_TO_NONE)
                .thatHasNo(GETTER, SETTER);
    }

    @Test
    public void methodGetCount() {
        it.hasMethod("getCount", withParams("char"))
                .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL)
                .thatReturns("int");
    }
}
