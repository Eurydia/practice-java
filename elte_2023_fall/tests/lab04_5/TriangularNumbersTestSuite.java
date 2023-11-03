package elte_2023_fall.tests.lab04_5;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

import famous.sequence.TriangularNumbersTest;

@Suite
@SelectClasses({
		TriangularNumbersStructureTest.class,
		TriangularNumbersTest.class
})
public class TriangularNumbersTestSuite {

}
