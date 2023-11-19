package github.eurydia.elte.fall2023.unit07.textfile;

import static check.CheckThat.*;
import static check.CheckThat.Condition.*;
import org.junit.jupiter.api.*;
import check.CheckThat;

public class StatisticsStructureTest {
    @BeforeAll
    public static void init() {
        CheckThat.theClass("github.eurydia.elte.fall2023.unit07.textfile.Statistics")
                .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL);
    }

    @Test
    public void constructor() {
        it.hasConstructor(withNoArgs())
                .thatIs(VISIBLE_TO_ALL);
    }

    @Test
    public void methodNumberOfCharacters() {
        it.hasMethodWithParams("numberOfCharacters", "String")
                .thatIs(FULLY_IMPLEMENTED, USABLE_WITHOUT_INSTANCE, VISIBLE_TO_ALL)
                .thatReturns("int");
    }

    @Test
    public void methodNumberOfLines() {
        it.hasMethodWithParams("numberOfLines", "String")
                .thatIs(FULLY_IMPLEMENTED, USABLE_WITHOUT_INSTANCE, VISIBLE_TO_ALL)
                .thatReturns("int");
    }
}
