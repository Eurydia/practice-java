package github.eurydia.elte.fall2023.tests.lab06;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

import github.elte_2023_fall.unit06.array.util.ArrayUtilTestSuite;

@Suite
@SelectClasses({
		SectorTimerTestSuite.class, ArrayUtilTestSuite.class, ElectionTestSuite.class
})
public class Lab06TestSuite {
}
