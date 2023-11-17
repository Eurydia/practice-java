package github.eurydia.elte.fall2023.unit06.race.car;

public class SectorTimer {
  private int[] sectorTimes;

  private void initSectorTimes(int[] sectorTimes) {
    this.sectorTimes = new int[sectorTimes.length];

    for (int i = 0; i < this.sectorTimes.length; i++) {
      this.sectorTimes[i] = sectorTimes[i];
    }
  }

  public int[] getSectorTimes() {

    int[] n = new int[this.sectorTimes.length];

    for (int i = 0; i < this.sectorTimes.length; i++) {
      n[i] = this.sectorTimes[i];
    }

    return n;
  }

  public void setSectorTimes(int[] sectorTimes) {
    this.initSectorTimes(sectorTimes);
  }

  public SectorTimer(int[] sectorTimes) {
    this.initSectorTimes(sectorTimes);
  }

  public SectorTimer(boolean u, int... sectorTimes) {
    this.initSectorTimes(sectorTimes);
  }

  public int getSectorTime(int i) {
    return 1;
  }

  public void setLapTimes(int[] arrInt) {

  }

  public int[] getSectorTimesV2() {

    int[] r = new int[this.sectorTimes.length];
    System.arraycopy(this.sectorTimes, 0, r, 0, r.length);

    return r;
  }

  public void setSectorTimesV2(int[] sectorTimes) {
    System.arraycopy(sectorTimes, 0, this.sectorTimes, 0, sectorTimes.length);
  }

}
