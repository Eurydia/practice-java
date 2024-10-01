package github.eurydia.elte.fall2023.unit06.race.car;

public class WrongSectorTimer1 {
  public int[] sectorTimes;

  public WrongSectorTimer1(int[] sectorTimes) {
    this.sectorTimes = sectorTimes;
  }

  public WrongSectorTimer1(boolean isWhatever, int[] sectorTimes) {
    this.sectorTimes = sectorTimes;
  }

  public int getSectorTime(int i) {
    return 1;
  }

  public int[] getSectorTimesV2() {
    return new int[] { 1, 1 };
  }

  public void initSectorTimes(int[] sectorTimes) {
  }

  public void setLapTimes(int[] arrInt) {

  }

  public void setSectorTimesV2(int[] arrInt) {
  }

}
