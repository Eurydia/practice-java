package github.eurydia.elte.fall2023.unit11.action.user;

import static check.CheckThat.*;
import static check.CheckThat.Condition.*;
import org.junit.jupiter.api.*;
import check.CheckThat;

public class MultiDimensionalPointStructureTest {
    @BeforeAll
    public static void init() {
        CheckThat
                .theClass("github.eurydia.elte.fall2023.unit11.action.user.MultiDimensionalPoint",
                        withInterfaces("github.eurydia.elte.fall2023.unit11.action.Undoable",
                                "github.eurydia.elte.fall2023.unit11.action.Scalable"))
                .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL);
        // .thatHas(NATURAL_ORDERING)
        // .thatHas(EQUALITY_CHECK);
    }

    @Test
    public void fieldCoordinates() {
        it.hasField("coordinates", ofType("array of int"))
                .thatIs(INSTANCE_LEVEL, MODIFIABLE, VISIBLE_TO_NONE)
                .thatHasNo(GETTER, SETTER);
    }

    @Test
    public void fieldLastCoordinates() {
        it.hasField("lastCoordinates", ofType("array of int"))
                .thatIs(INSTANCE_LEVEL, MODIFIABLE, VISIBLE_TO_NONE)
                .thatHasNo(GETTER, SETTER);
    }

    @Test
    public void constructor() {
        it.hasConstructor(withArgs("vararg of int"))
                .thatIs(VISIBLE_TO_ALL);
    }

    @Test
    public void methodGet() {
        it.hasMethod("get", withParams("int"))
                .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL)
                .thatReturns("int");
    }

    @Test
    public void methodSet() {
        it.hasMethod("set", withParams("int", "int"))
                .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL)
                .thatReturnsNothing();
    }

    @Test
    public void methodScale() {
        it.hasMethod("scale", withParams("int"))
                .thatIsInheritedFrom("github.eurydia.elte.fall2023.unit11.action.Scalable")
                .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL)
                .thatReturnsNothing();
    }

    @Test
    public void methodSaveToLast() {
        it.hasMethod("saveToLast", withNoParams())
                .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_NONE)
                .thatReturnsNothing();
    }

    @Test
    public void methodUndoLast() {
        it.hasMethod("undoLast", withNoParams())
                .thatIsInheritedFrom("github.eurydia.elte.fall2023.unit11.action.Undoable")
                .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL)
                .thatReturnsNothing();
    }
}
