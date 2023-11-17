package github.eurydia.elte.fall2023.unit06.array.util;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ArrayUtilTest {
    @Test
    public void maxLength0() {
        assertEquals(0, ArrayUtil.max(new int[] { 0 }));
        assertEquals(1, ArrayUtil.max2(new int[] { 1 }));
        assertEquals(2, ArrayUtil.max3(new int[] { 2 }));
        assertEquals(3, ArrayUtil.max4(new int[] { 3 }));
    }

    @Test
    public void maxLength1() {
        assertEquals(1, ArrayUtil.max(new int[] { 1 }));
        assertEquals(2, ArrayUtil.max2(new int[] { 2 }));
        assertEquals(3, ArrayUtil.max3(new int[] { 3 }));
        assertEquals(4, ArrayUtil.max4(new int[] { 4 }));
    }

    @Test
    public void maxLength2() {
        assertEquals(1, ArrayUtil.max(new int[] { 0, 1 }));
        assertEquals(2, ArrayUtil.max2(new int[] { 0, 2 }));
        assertEquals(3, ArrayUtil.max3(new int[] { 0, 3 }));
        assertEquals(4, ArrayUtil.max4(new int[] { 0, 4 }));
    }

}
