package github.eurydia.elte.fall2023.unit04.cipher;

import static check.CheckThat.*;
import static check.CheckThat.Condition.*;
import org.junit.jupiter.api.*;
import check.CheckThat;

public class CaesarCipherStructureTest {
    @BeforeAll
    public static void init() {
        CheckThat.theClass("github.eurydia.elte.fall2023.unit04.cipher.CaesarCipher")
                .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL);
    }

    @Test
    public void fieldShift() {
        it.hasField("shift", ofType("int"))
                .thatIs(INSTANCE_LEVEL, MODIFIABLE, VISIBLE_TO_NONE)
                .thatHasNo(GETTER, SETTER);
    }

    @Test
    public void constructor() {
        it.hasConstructorWithParams("int")
                .thatIs(VISIBLE_TO_ALL);
    }

    @Test
    public void methodDecrypt() {
        it.hasMethodWithParams("decrypt", "String")
                .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL)
                .thatReturns("String");
    }

    @Test
    public void methodEncrypt() {
        it.hasMethodWithParams("encrypt", "String")
                .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL)
                .thatReturns("String");
    }
}
