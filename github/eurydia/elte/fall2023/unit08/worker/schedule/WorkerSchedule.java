package github.eurydia.elte.fall2023.unit08.worker.schedule;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;

public class WorkerSchedule {
  private HashMap<Integer, HashSet<String>> weekToWorkers;

  public WorkerSchedule() {
    this.weekToWorkers = new HashMap<Integer, HashSet<String>>();

    for (int i = 0; i < 52; i++) {
      this.weekToWorkers.put(i, new HashSet<String>());
    }
  }

  public void add(int weekNumber, HashSet<String> workers) {
    this.weekToWorkers.get(weekNumber - 1).addAll(workers);
  }

  public void add(HashSet<Integer> weekNumbers, ArrayList<String> workers) {

    var workersHashSet = new HashSet<String>(workers);

    for (int weekNumber : weekNumbers) {
      this.add(weekNumber, workersHashSet);
    }

  }

  public boolean isWorkingOnWeek(String worker, int weekNumber) {

    return this.weekToWorkers.get(weekNumber - 1).contains(worker);

  }

  public HashSet<Integer> getWorkWeeks(String worker) {
    HashSet<Integer> workingWeeks = new HashSet<Integer>();

    for (Entry<Integer, HashSet<String>> entry : this.weekToWorkers.entrySet()) {
      if (entry.getValue().contains(worker)) {
        workingWeeks.add(entry.getKey() + 1);
      }
    }
    return workingWeeks;

  }
}
