package github.eurydia.elte.fall2023.assignment.planet.structure;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

// import github.eurydia.elte.fall2023.assignment.planet.test.PlanterExtendedTest;

@Suite
@SelectClasses({
                PlanterExtendedStructureTest.class,
                // PlanterExtendedTest.class,
                PlanetCompulsoryTestSuite.class
})
public class PlanetFullTestSuite {
}
