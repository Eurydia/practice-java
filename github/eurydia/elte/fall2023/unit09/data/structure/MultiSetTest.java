package github.eurydia.elte.fall2023.unit09.data.structure;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MultiSetTest {
  @Test
  public void multSetInteger() {
    var bag = new MultiSet<Integer>(new Integer[] { 1, 2, 1 });

    assertEquals(2, bag.getCount(1));
    assertEquals(1, bag.getCount(2));
  }

  @Test
  public void multSetString() {
    var bag = new MultiSet<String>(new String[] { "Hi", "Hi", "H" });

    assertEquals(2, bag.getCount("Hi"));
    assertEquals(1, bag.getCount("H"));
  }

  @Test
  public void intersect() {
    var bagA = new MultiSet<String>(new String[] { "Hi", "Hi", "H" });
    var bagB = new MultiSet<String>(new String[] { "Hi", "H" });

    var bagC = bagA.intersect(bagB);

    assertEquals(1, bagC.getCount("Hi"));
    assertEquals(1, bagC.getCount("H"));
  }

  @Test
  public void countExcept() {
    var bag = new MultiSet<String>(new String[] { "Hi", "Hi", "H" });

    assertEquals(1, bag.countExcept("Hi"));
    assertEquals(2, bag.countExcept("H"));
  }

}
