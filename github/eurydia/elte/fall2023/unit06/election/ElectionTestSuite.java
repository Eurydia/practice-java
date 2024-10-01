package github.eurydia.elte.fall2023.unit06.election;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
		CandidateStructureTest.class,
		ElectionStructureTest.class,
		ElectionTestStructureTest.class,
		ElectionTest.class
})
public class ElectionTestSuite {
}
