package github.eurydia.elte.fall2023.unit10.cafe;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
    BartenderStructureTest.class,
    GuestStructureTest.class,
    AdultStructureTest.class,
    MinorStructureTest.class
})
public class CafeSuite {
}
