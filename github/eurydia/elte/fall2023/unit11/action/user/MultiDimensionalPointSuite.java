package github.eurydia.elte.fall2023.unit11.action.user;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

import github.eurydia.elte.fall2023.unit11.action.ScalableStructureTest;
import github.eurydia.elte.fall2023.unit11.action.UndoableStructureTest;

@Suite
@SelectClasses({
		ScalableStructureTest.class,
		UndoableStructureTest.class,
		MultiDimensionalPointStructureTest.class,
		MultiDimensionalPointTest.class
})
public class MultiDimensionalPointSuite {
}
