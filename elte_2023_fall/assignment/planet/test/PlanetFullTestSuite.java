package elte_2023_fall.assignment.planet.test;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
                PlanetCompulsoryTest.class,
                PlanetExtendedTest.class,
})
public class PlanetFullTestSuite {
}
