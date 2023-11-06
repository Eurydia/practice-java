package elte_2023_fall.unit04.math.operation.safe

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PowerTest {
    @Test
    public void zeroToZero() {
        assertEquals(1.0, Power.power(0, 0), 0.00000000000000000000000000001);
    }

    @Test
    public void twoToTwo() {
        assertEquals(4.0, Power.power(2, 2), 0.00000000000000000000000000001);
    }

    @Test
    public void twoToNegOne() {
        assertEquals(1.0 / 2.0, Power.power(2, -1), 0.00000000000000000000000000001);
    }

}
