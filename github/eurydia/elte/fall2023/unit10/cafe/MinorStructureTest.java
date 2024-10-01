package github.eurydia.elte.fall2023.unit10.cafe;

import static check.CheckThat.*;
import static check.CheckThat.Condition.*;
import org.junit.jupiter.api.*;
import check.CheckThat;

public class MinorStructureTest {
    @BeforeAll
    public static void init() {
        CheckThat
                .theClass("github.eurydia.elte.fall2023.unit10.cafe.Minor",
                        withParent("github.eurydia.elte.fall2023.unit10.cafe.Guest"))
                .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL);
    }

    @Test
    public void constructor() {
        it.hasConstructor(withArgs("String", "int"))
                .thatIs(VISIBLE_TO_ALL);
    }
}
