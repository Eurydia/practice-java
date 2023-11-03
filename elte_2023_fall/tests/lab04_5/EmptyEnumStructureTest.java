package elte_2023_fall.tests.lab04_5;

import static check.CheckThat.*;
import static check.CheckThat.Condition.*;
import org.junit.jupiter.api.*;
import check.CheckThat;

public class EmptyEnumStructureTest {
    @BeforeAll
    public static void init() {
        CheckThat.theEnum("EmptyEnum")
                .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL)
                .hasEnumElements();
    }
}
