package github.eurydia.elte.fall2023.unit06.race.car;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
		WrongSectorTimer1StructureTest.class,
		WrongSectorTimer1Test.class,

		WrongSectorTimer2StructureTest.class,
		WrongSectorTimer2Test.class,

		LapTimerStructureTest.class,
		SectorTimerTest.class
})
public class LapTimerTestSuite {
}
