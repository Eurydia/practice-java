package elte_2023_fall.tests.lab04_5;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

import elte_2023_fall.unit05.math.textual.AdderTest;

@Suite
@SelectClasses({
    AdderStructureTest.class,
    AdderTest.class
})
public class AdderTestSuite {
}
