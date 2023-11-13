package github.eurydia.elte.fall2023.unit04.music.recording;

import static check.CheckThat.*;
import static check.CheckThat.Condition.*;
import org.junit.jupiter.api.*;
import check.CheckThat;

public class RecordLabelStructureTest {
    @BeforeAll
    public static void init() {
        CheckThat.theClass("github.eurydia.elte.fall2023.unit04.music.recording.RecordLabel")
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
    public void fieldCash() {
        it.hasField("cash", ofType("int"))
                .thatIs(INSTANCE_LEVEL, MODIFIABLE, VISIBLE_TO_NONE)
                .thatHas(GETTER)
                .thatHasNo(SETTER);
    }

    @Test
    public void constructor() {
        it.hasConstructorWithParams("String", "int")
                .thatIs(VISIBLE_TO_ALL);
    }

    @Test
    public void methodGotIncome() {
        it.hasMethodWithParams("gotIncome", "int")
                .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL)
                .thatReturnsNothing();
    }
}
