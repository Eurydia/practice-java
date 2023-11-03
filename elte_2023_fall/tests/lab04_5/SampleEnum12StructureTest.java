package elte_2023_fall.tests.lab04_5;

import static check.CheckThat.*;
import static check.CheckThat.Condition.*;
import org.junit.jupiter.api.*;
import check.CheckThat;

public class SampleEnum12StructureTest {
    @BeforeAll
    public static void init() {
        CheckThat.theEnum("pkg1.pkg2.SampleEnum12")
                .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL)
                .hasEnumElements("A", "B", "C");
    }
}
