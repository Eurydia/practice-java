package elte_2023_fall.tests.lab04_5;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

import math.operation.safe.IncrementTest;

@Suite
@SelectClasses({
        IncrementStructureTest.class,
        IncrementTest.class
})
public class IncrementTestSuite {
}
