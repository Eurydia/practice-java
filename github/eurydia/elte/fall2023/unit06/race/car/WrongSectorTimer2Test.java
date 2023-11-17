package github.eurydia.elte.fall2023.unit06.race.car;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WrongSectorTimer2Test {

  @Test
  public void seemsGood() {

    var arrInt = new int[] { 1, 2, 3 };

    var wrongTimer = new WrongSectorTimer2(arrInt);

    assertEquals(3, wrongTimer.getSectorTimes().length);
    assertArrayEquals(new int[] { 1, 2, 3 }, wrongTimer.getSectorTimes());
  }

  @Test
  public void getterBreaksEncapsulation() {
    var arrInt = new int[] { 1, 2, 3 };

    var wrongTimer = new WrongSectorTimer2(arrInt);

    wrongTimer.getSectorTimes()[0] = 3;

    assertEquals(3, wrongTimer.getSectorTimes().length);

    assertArrayEquals(new int[] { 3, 2, 3 }, wrongTimer.getSectorTimes());
  }

  @Test
  public void setArrayElemsBreaksEncapsulation() {

    var arrInt = new int[] { 1, 2, 3 };
    var arrIntB = new int[] { 4, 5, 6, 7 };

    var wrongTimer = new WrongSectorTimer2(arrInt);

    wrongTimer.setSectorTimes(arrIntB);

    arrIntB[0] = 8;

    assertEquals(4, wrongTimer.getSectorTimes().length);
    assertArrayEquals(new int[] { 8, 5, 6, 7 }, wrongTimer.getSectorTimes());
  }

}
