package github.eurydia.elte.fall2023.unit06.array.util;

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
            maxSeen = Math.max(maxSeen, arr[i]);
        }
        return maxSeen;
    }

    public static int max4(int[] arr) {

        if (arr.length <= 0) {
            return 0;
        }

        int maxSeen = Integer.MIN_VALUE;
        for (int v : arr) {
            maxSeen = Math.max(maxSeen, v);
        }
        return maxSeen;
    }

    public static int[] minMax(int[] arr) {
        if (arr.length <= 0) {
            return new int[] { 0, 0 };
        }

        int currMin = arr[0];
        int currMax = arr[0];
        for (int x : arr) {
            if (x > currMax) {
                currMax = x;
            }

            if (x < currMin) {
                currMin = x;
            }
        }

        return new int[] { currMin, currMax };

    }
}
