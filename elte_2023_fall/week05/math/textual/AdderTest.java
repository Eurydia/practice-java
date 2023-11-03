package elte_2023_fall.week05.math.textual;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class AdderTest {
    @Test
    public void wrongInput() {
        UnsupportedOperationException thrown = assertThrows(UnsupportedOperationException.class,
                () -> Adder.addAsText("Hi", "JI"));
        assertEquals("Operands are not numbers", thrown.getMessage());
    }

    @Test
    public void addZeroToLeft() {
        assertEquals("1", Adder.addAsText("0", "1"));
    }

    @Test
    public void addZeroToRight() {
        assertEquals("1", Adder.addAsText("1", "0"));
    }

    @Test
    public void addDoubleZeroToInt() {

        UnsupportedOperationException thrown = assertThrows(UnsupportedOperationException.class,
                () -> Adder.addAsText("0.0", "1"));
        assertEquals("Operands are not numbers", thrown.getMessage());
    }

    @Test
    public void addIntTwoToIntThree() {

        assertEquals("5", Adder.addAsText("2", "3"));
    }

    @Test
    public void addIntThreeToIntTwo() {

        assertEquals("5", Adder.addAsText("3", "2"));
    }

    @Test
    public void addIntToInt() {

        assertEquals("5", Adder.addAsText("3", "2"));
    }

    @Test
    public void addDoubleToDouble() {

        assertEquals("5.0", Adder.addAsText("3.0", "2.0"));
    }

    @Test
    public void addIntToDouble() {

        UnsupportedOperationException thrown = assertThrows(UnsupportedOperationException.class,
                () -> Adder.addAsText("3", "2.0"));
        assertEquals("Operands are not numbers", thrown.getMessage());

    }

    @Test
    public void commutative() {

        assertEquals(Adder.addAsText("2", "3"), Adder.addAsText("3", "2"));

    }

}
