package github.eurydia.elte.fall2023.unit04.famous.sequence;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TriangularNumbersTest {
    @Test
    public void triangleNumberZeroIsZero() {
        assertEquals(0, TriangularNumbers.getTriangularNumber(0));
    }

    @Test
    public void triangleNumberOneIsOne() {
        assertEquals(3, TriangularNumbers.getTriangularNumber(2));
    }

    @Test
    public void triangleNumberAltZeroIsZero() {
        assertEquals(0, TriangularNumbers.getTriangularNumberAlternative(0));
    }

    @Test
    public void triangleAltNumberOneIsOne() {
        assertEquals(3, TriangularNumbers.getTriangularNumberAlternative(2));
    }
}