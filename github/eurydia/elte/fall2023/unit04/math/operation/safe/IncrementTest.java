package github.eurydia.elte.fall2023.unit04.math.operation.safe;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IncrementTest {

    @Test
    public void zeroIncOneIsOne() {
        assertEquals(1, Increment.increment(0));
    }

    @Test
    public void smallestInt() {
        assertEquals(Integer.MIN_VALUE + 1, Increment.increment(Integer.MIN_VALUE));
    }

    @Test
    public void largestInt() {
        assertEquals(Integer.MAX_VALUE, Increment.increment(Integer.MAX_VALUE));
    }

    @Test
    public void oneIncOneIsTwo() {
        assertEquals(2, Increment.increment(1));
    }

    @Test
    public void minusTwoIncOneIsTwo() {
        assertEquals(-1, Increment.increment(-2));
    }

    @Test
    public void minusOneIncOneIsZero() {
        assertEquals(0, Increment.increment(-1));
    }

}
