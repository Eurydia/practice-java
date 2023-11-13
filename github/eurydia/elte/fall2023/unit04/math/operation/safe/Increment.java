package github.eurydia.elte.fall2023.unit04.math.operation.safe;

public class Increment {
    public static int increment(int x) {
        if (x == Integer.MAX_VALUE) {
            return x;
        }
        return x + 1;
    }
}
