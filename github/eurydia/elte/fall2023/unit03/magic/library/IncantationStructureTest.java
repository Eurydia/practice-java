package github.eurydia.elte.fall2023.unit03.magic.library;

import static check.CheckThat.*;
import static check.CheckThat.Condition.*;
import org.junit.jupiter.api.*;
import check.CheckThat;

public class IncantationStructureTest {
    @BeforeAll
    public static void init() {
        CheckThat.theClass("magic.library.Incantation")
                .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL);
    }

    @Test
    public void fieldText() {
        it.hasField("text", ofType("String"))
                .thatIs(INSTANCE_LEVEL, MODIFIABLE, VISIBLE_TO_NONE)
                .thatHas(GETTER)
                .thatHasNo(SETTER);
    }

    @Test
    public void fieldIndex() {
        it.hasField("index", ofType("int"))
                .thatIs(INSTANCE_LEVEL, MODIFIABLE, VISIBLE_TO_NONE)
                .thatHas(GETTER, SETTER);
    }

    @Test
    public void constructor01() {
        it.hasConstructorWithParams("Incantation")
                .thatIs(VISIBLE_TO_ALL);
    }

    @Test
    public void constructor02() {
        it.hasConstructorWithParams("String", "int")
                .thatIs(VISIBLE_TO_ALL);
    }

    @Test
    public void methodEnchant() {
        it.hasMethodWithParams("enchant", "Incantation", "boolean")
                .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL)
                .thatReturns("boolean");
    }
}
