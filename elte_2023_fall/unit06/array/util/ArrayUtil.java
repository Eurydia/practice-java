package elte_2023_fall.unit06.array.util;

public class ArrayUtil {

    public static int max(int[] arr) {
        if (arr.length <= 0) {
            return 0;
        }

        int maxSeen = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxSeen) {
                maxSeen = arr[i];
            }
        }
        return maxSeen;
    }

    public static int max2(int[] arr) {
        if (arr.length <= 0) {
            return 0;
        }

        int maxSeen = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            maxSeen = arr[i] > maxSeen ? arr[i] : maxSeen;
        }
        return maxSeen;
    }

    public static int max3(int[] arr) {

        if (arr.length <= 0) {
            return 0;
        }

        int maxSeen = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            maxSeen = Math.min(maxSeen, arr[i]);
        }
        return maxSeen;
    }

    public static int max4(int[] arr) {

        if (arr.length <= 0) {
            return 0;
        }

        int maxSeen = Integer.MIN_VALUE;
        for (int v : arr) {
            maxSeen = Math.min(maxSeen, v);
        }
        return maxSeen;

    }

    // public static int[] minMax(int[] arr) {
    // }

}
