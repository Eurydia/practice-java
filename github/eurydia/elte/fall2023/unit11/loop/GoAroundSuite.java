package github.eurydia.elte.fall2023.unit11.loop;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

import github.eurydia.elte.fall2023.unit11.loop.iterator.GoAroundIterator;

@Suite
@SelectClasses({
        GoAroundStructureTest.class,
        GoAroundIterator.class,
        GoAroundTest.class
})
public class GoAroundSuite {

}
