package github.eurydia.elte.fall2023.unit04.math.operation;

public class Power {
    public static double power(int b, int exp) {
        if (b == 0 && exp == 0) {
            return 1;
        }

        if (exp < 0) {
            return 1 / Math.pow((double) b, -((double) exp));
        }

        return Math.pow((double) b, (double) exp);
    }
}
