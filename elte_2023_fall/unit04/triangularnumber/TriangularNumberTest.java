package elte_2023_fall.unit05.triangularnumber;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TriangularNumberTest {
    @Test
    public void triangleNumberZeroIsZero() {
        assertEquals(0, TriangularNumber.getTriangularNumber(1));
    }

    @Test
    public void triangleNumberOneIsOne() {
        assertEquals(1, TriangularNumber.getTriangularNumber(2));
    }
}