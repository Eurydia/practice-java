package elte_2023_fall.week05.math.operation.safe;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IncrementTest {

    @Test
    public static void zeroIncOneIsOne() {
        assertEquals(1, Increment.increment(0));
    }

    @Test
    public static void smallestInt() {
        assertEquals(Integer.MIN_VALUE + 1, Increment.increment(Integer.MIN_VALUE));
    }

    @Test
    public static void largestInt() {
        assertEquals(Integer.MAX_VALUE, Increment.increment(Integer.MAX_VALUE));
    }

    @Test
    public static void oneIncOneIsTwo() {
        assertEquals(2, Increment.increment(1));
    }

    @Test
    public static void minusTwoIncOneIsTwo() {
        assertEquals(-1, Increment.increment(-2));
    }

    @Test
    public static void minusOneIncOneIsZero() {
        assertEquals(0, Increment.increment(-1));
    }

}
