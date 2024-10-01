package github.eurydia.elte.fall2023.unit06.race.car;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WrongSectorTimer1Test {

  @Test
  public void seemsGood() {

    var wrongTimer = new WrongSectorTimer1(new int[] { 1, 2, 3 });

    assertArrayEquals(new int[] { 1, 2, 3 }, wrongTimer.sectorTimes);
  }

  @Test
  public void setArrayElemsBreaksEncapsulation() {

    var wrongTimer = new WrongSectorTimer1(new int[] { 1, 2, 3 });
    wrongTimer.sectorTimes[0] = 3;

    assertArrayEquals(new int[] { 3, 2, 3 }, wrongTimer.sectorTimes);
    assertEquals(3, wrongTimer.sectorTimes.length);

    wrongTimer.sectorTimes = new int[] { 1, 1, 1, 1 };
    assertArrayEquals(new int[] { 1, 1, 1, 1 }, wrongTimer.sectorTimes);
    assertEquals(4, wrongTimer.sectorTimes.length);
  }

}
