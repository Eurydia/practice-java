package elte_2023_fall.unit01;
// Compute the greatest common divisor of the (positive or negative) integer numbers provided as command-line arguments. Your program should convert all of its command-line arguments into integer numbers, and compute their greatest common divisors.

// The command-line arguments and the result should be represented with long values. This type is a 64-bits signed integer type. To convert a string to this type, use the Long.parseLong(...) function.
public class P3 {

    public static long gcd(long x, long y) {
        long i, greatest_common_divisor = 1;

        for (i = 2; i < Long.max(x, y) + 1; i++) {
            if (x % i == 0 && y % i == 0) {
                greatest_common_divisor = i;
            }
        }

        return greatest_common_divisor;
    }

    public static void main(String[] args) {

        if (args.length < 2) {
            System.err.println("Insufficient input.");
            System.exit(1);
        }

        int i;
        long x, y;
        x = Long.parseLong(args[0]);
        for (i = 1; i < args.length; i++) {
            y = Long.parseLong(args[i]);
            x = gcd(x, y);
        }

        System.out.printf("%d\n", x);
    }

}
