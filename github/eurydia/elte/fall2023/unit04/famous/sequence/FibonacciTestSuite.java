package github.eurydia.elte.fall2023.unit04.famous.sequence;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
    FibonacciTest.class,
    FibonacciStructureTest.class,
})
public class FibonacciTestSuite {

}
