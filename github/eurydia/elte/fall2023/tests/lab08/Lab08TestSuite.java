package github.eurydia.elte.fall2023.tests.lab08;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
                WorkerScheduleTestSuite.class, ListUtilSuite.class, CharacterStatisticsSuite.class
})
public class Lab08TestSuite {
}
