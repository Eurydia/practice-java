package github.eurydia.elte.fall2023.unit04.famous.sequence;

public class TriangularNumbers {
    public static int getTriangularNumber(int n) {
        int curr = 0;
        for (int i = 1; i <= n; i++) {
            curr += i;
        }
        return curr;
    }

    public static int getTriangularNumberAlternative(int n) {
        return n * (n + 1) / 2;
    }

}