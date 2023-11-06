package elte_2023_fall.unit04.triangularnumber;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TriangularNumbersTest {
    @Test
    public void triangleNumberZeroIsZero() {
        assertEquals(0, TriangularNumber.getTriangularNumber(1));
    }

    @Test
    public void triangleNumberOneIsOne() {
        assertEquals(1, TriangularNumber.getTriangularNumber(2));
    }
}