package github.eurydia.elte.fall2023.tests.lab10.book;

import static check.CheckThat.*;
import static check.CheckThat.Condition.*;
import org.junit.jupiter.api.*;
import check.CheckThat;

public class CoverTypeStructureTest {
    @Test
    public void testEnum() {
        CheckThat.theEnum("printed.material.CoverType")
                .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL)
                .hasEnumElements("SOFTCOVER", "HARDCOVER");
    }
}
