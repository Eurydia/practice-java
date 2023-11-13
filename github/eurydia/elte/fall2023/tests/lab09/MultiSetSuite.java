package github.eurydia.elte.fall2023.tests.lab09;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

import data.structure.MultiSetTest;

@Suite
@SelectClasses({
        MultiSetStructureTest.class, MultiSetTest.class
})
public class MultiSetSuite {
}
