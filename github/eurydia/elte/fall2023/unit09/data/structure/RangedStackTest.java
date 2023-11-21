package github.eurydia.elte.fall2023.unit09.data.structure;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class RangedStackTest {

  @Test
  public void empty() {
    var stackA = new RangedStack<Integer>();

    assertEquals(new ArrayList<Integer>(), stackA.pop(0));
  }

  @Test
  public void testString() {
    var stack = new RangedStack<String>();

    stack.push("2", "4", "6", "8", "10", "12");

    assertEquals(new ArrayList<String>(List.of("12")), stack.pop(1));
    assertEquals(new ArrayList<String>(List.of("10", "8")), stack.pop(2));
    assertEquals(new ArrayList<String>(List.of("6", "4", "2")), stack.pop(100));

  }

  @Test
  public void testInteger() {
    var stack = new RangedStack<Integer>();
    stack.push(2, 4, 6, 8, 10, 12);

    assertEquals(new ArrayList<Integer>(List.of(12)), stack.pop(1));
    assertEquals(new ArrayList<Integer>(List.of(10, 8)), stack.pop(2));
    assertEquals(new ArrayList<Integer>(List.of(6, 4, 2)), stack.pop(100));

  }

}
