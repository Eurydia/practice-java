package github.eurydia.elte.fall2023.unit04.music.recording;

public class RecordLabel {
  private final String name;
  private int cash;

  public String getName() {
    return this.name;
  }

  public int getCash() {
    return this.cash;
  }

  public RecordLabel(String name, int cash) {
    this.name = name;
    this.cash = cash;
  }

  public void gotIncome(int income) {
    this.cash += income;
  }

}
