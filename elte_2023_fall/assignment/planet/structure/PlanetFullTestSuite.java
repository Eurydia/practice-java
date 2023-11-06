package elte_2023_fall.assignment.planet.structure;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

import elte_2023_fall.assignment.planet.test.PlanterExtendedTest;

@Suite
@SelectClasses({
    PlanterExtendedStructureTest.class,
    PlanterExtendedTest.class,
    PlanetCompulsoryTestSuite.class
})
public class PlanetFullTestSuite {
}
