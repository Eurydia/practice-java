package elte_2023_fall.assignment.planet.structure;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

import elte_2023_fall.assignment.planet.test.PlanetCompulsoryTest;

@Suite
@SelectClasses({
        PlanetCompulsoryStructureTest.class,
        PlanetCompulsoryTest.class,
        PlanterCompulsoryStructureTest.class
})

public class PlanetCompulsoryTestSuite {
}
