package github.eurydia.elte.fall2023.tests.lab08;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

import worker.schedule.WorkerScheduleTest;

@Suite
@SelectClasses({
        WorkerScheduleStructureTest.class, WorkerScheduleTest.class
})
public class WorkerScheduleSuite {
}
