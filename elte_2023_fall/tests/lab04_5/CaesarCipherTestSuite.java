package elte_2023_fall.tests.lab04_5;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

import cipher.CaesarCipherTest;

@Suite
@SelectClasses({
        CaesarCipherStructureTest.class,
        CaesarCipherTest.class
})
public class CaesarCipherTestSuite {
}
