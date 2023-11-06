package elte_2023_fall.unit04.math.textual;

import static check.CheckThat.*;
import static check.CheckThat.Condition.*;
import org.junit.jupiter.api.*;
import check.CheckThat;

public class AdderStructureTest {
    @BeforeAll
    public static void init() {
        CheckThat.theClass("math.operation.textual.Adder")
                .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL);
    }

    @Test
    public void constructor() {
        it.hasConstructor(withNoArgs())
                .thatIs(VISIBLE_TO_ALL);
    }

    @Test
    public void methodAddAsText() {
        it.hasMethodWithParams("addAsText", "String", "String")
                .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL)
                .thatReturns("String");
    }
}
