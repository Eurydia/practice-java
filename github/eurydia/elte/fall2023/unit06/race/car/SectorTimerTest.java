package github.eurydia.elte.fall2023.unit06.race.car;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SectorTimerTest {

  @Test
  public void seemsGood() {

    var arrInt = new int[] { 1, 2, 3 };

    var timer = new SectorTimer(arrInt);

    assertEquals(3, timer.getSectorTimes().length);
    assertArrayEquals(new int[] { 1, 2, 3 }, timer.getSectorTimes());
  }

  @Test
  public void getterBreaksEncapsulation() {
    var arrInt = new int[] { 1, 2, 3 };

    var timer = new SectorTimer(arrInt);

    timer.getSectorTimes()[0] = 3;

    assertEquals(3, timer.getSectorTimes().length);

    assertArrayEquals(new int[] { 3, 2, 3 }, timer.getSectorTimes());
  }

  @Test
  public void setArrayElemsBreaksEncapsulation() {

    var arrInt = new int[] { 1, 2, 3 };
    var arrIntB = new int[] { 4, 5, 6, 7 };

    var timer = new SectorTimer(arrInt);

    timer.setSectorTimes(arrIntB);
    arrIntB[0] = 8;

    assertEquals(4, timer.getSectorTimes().length);
    assertArrayEquals(new int[] { 8, 5, 6, 7 }, timer.getSectorTimes());
  }

}
