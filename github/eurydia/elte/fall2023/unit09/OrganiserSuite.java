package github.eurydia.elte.fall2023.unit09;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

import data.organiser.OrganiserTest;

@Suite
@SelectClasses({
                OrganiserStructureTest.class, OrganiserTest.class
})
public class OrganiserSuite {
}
