package elte_2023_fall.unit04.cipher;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
                CaesarCipherStructureTest.class,
                CaesarCipherTest.class
})
public class CaesarCipherTestSuite {
}
