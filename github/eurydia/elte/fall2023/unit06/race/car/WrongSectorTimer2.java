package github.eurydia.elte.fall2023.unit06.race.car;

public class WrongSectorTimer2 {

  private int[] sectorTimes;

  public int[] getSectorTimes() {
    return this.sectorTimes;
  }

  public void setSectorTimes(int[] nSectorTimes) {
    this.sectorTimes = nSectorTimes;
  }

  public WrongSectorTimer2(int[] sectorTimes) {
    this.sectorTimes = sectorTimes;
  }

  public int getLapTime(int i) {
    return 0;
  }

  public int getSectorTime(int i) {
    return 0;
  }

}
