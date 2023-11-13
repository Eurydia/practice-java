package github.eurydia.elte.fall2023.assignment.planet.structure;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

import github.eurydia.elte.fall2023.assignment.planet.test.PlanetCompulsoryTest;

@Suite
@SelectClasses({
        PlanetCompulsoryStructureTest.class,
        PlanterCompulsoryStructureTest.class,
        PlanetCompulsoryTest.class
})
public class PlanetCompulsoryTestSuite {
}
