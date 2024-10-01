package github.eurydia.elte.fall2023.unit04.cipher;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
    CaesarCipherStructureTest.class,
    CaesarCipherTest.class
})
public class CaesarCipherTestSuite {
}
