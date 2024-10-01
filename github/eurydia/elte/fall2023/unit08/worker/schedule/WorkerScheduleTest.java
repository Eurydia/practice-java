package github.eurydia.elte.fall2023.unit08.worker.schedule;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.ArrayList;
import java.util.HashSet;

import org.junit.Test;

public class WorkerScheduleTest {
  @Test
  public void emptySchedule() {

    var workerSchedule = new WorkerSchedule();

    assertFalse(workerSchedule.isWorkingOnWeek("James", 1));
  }

  @Test
  public void schedule() {
    var workWeeksA = new HashSet<Integer>();

    workWeeksA.add(1);
    workWeeksA.add(16);
    workWeeksA.add(32);

    var workerSchedule = new WorkerSchedule();

    var workers = new ArrayList<String>();
    workers.add("B");
    workers.add("C");

    workerSchedule.add(20, new HashSet<String>(workers));
    var workerArrayList = new ArrayList<String>();
    workerArrayList.add("A");
    workerSchedule.add(workWeeksA, workerArrayList);

    assertEquals(true, workerSchedule.isWorkingOnWeek("A", 1));
    assertFalse(workerSchedule.isWorkingOnWeek("A", 2));
    assertEquals(true, workerSchedule.isWorkingOnWeek("B", 20));
  }
}
