package github.eurydia.elte.fall2023.assignment.planet.test;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
                PlanetCompulsoryTest.class,
                PlanetExtendedTest.class,
})
public class PlanetFullTestSuite {
}
