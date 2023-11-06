package elte_2023_fall.unit04.math.operation.safe;

public class Increment {
    public static int increment(int x) {
        if (x == Integer.MAX_VALUE) {
            return x;
        }
        return x + 1;
    }
}
