package github.eurydia.elte.fall2023.unit04.triangularnumber;

public class TriangularNumber {
    public static int getTriangularNumber(int n) {
        int curr = 0;
        for (int i = 1; i < n; i++) {
            curr += i;
        }
        return curr;
    }

}