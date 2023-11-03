package elte_2023_fall.week06.array.util;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ArrayUtilTest {
    @Test
    public void maxLength0() {
        assertEquals(0, ArrayUtil.max(new int[] { 0 }));
        assertEquals(0, ArrayUtil.max2(new int[] { 0 }));
        assertEquals(0, ArrayUtil.max3(new int[] { 0 }));
        assertEquals(0, ArrayUtil.max4(new int[] { 0 }));
    }

    @ParameterizedTest
    @CsvSource({ "0", "1", })
    public void maxLength2(int min, int max) {
        assertEquals(max, ArrayUtil.max(new int[] { min, max }));
        assertEquals(max, ArrayUtil.max2(new int[] { min, max }));
        assertEquals(max, ArrayUtil.max3(new int[] { min, max }));
        assertEquals(max, ArrayUtil.max4(new int[] { min, max }));
    }

    @ParameterizedTest
    @ValueSource(ints = { 1, 0, -312321, 312321 })

    public void maxLength1(int max) {

        assertEquals(max, ArrayUtil.max(new int[] { max }));
        assertEquals(max, ArrayUtil.max2(new int[] { max }));
        assertEquals(max, ArrayUtil.max3(new int[] { max }));
        assertEquals(max, ArrayUtil.max4(new int[] { max }));
    }

}
