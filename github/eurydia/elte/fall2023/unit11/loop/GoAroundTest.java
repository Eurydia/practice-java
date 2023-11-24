package github.eurydia.elte.fall2023.unit11.loop;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GoAroundTest {
  @Test
  public void test() {
    var gi = new GoAround<Integer>(2, 1, 2, 3, 4);
    var it = gi.iterator();

    assertTrue(it.hasNext());

    assertEquals(Integer.valueOf(1), it.next());

    assertTrue(it.hasNext());

    assertEquals(Integer.valueOf(2), it.next());

    assertTrue(it.hasNext());

    assertEquals(Integer.valueOf(3), it.next());

    assertTrue(it.hasNext());

    assertEquals(Integer.valueOf(4), it.next());

    assertTrue(it.hasNext());

    assertEquals(Integer.valueOf(1), it.next());

    assertTrue(it.hasNext());

    assertEquals(Integer.valueOf(2), it.next());

    assertTrue(it.hasNext());

    assertEquals(Integer.valueOf(3), it.next());

    assertTrue(it.hasNext());

    assertEquals(Integer.valueOf(4), it.next());

    assertFalse(it.hasNext());
  }
}
