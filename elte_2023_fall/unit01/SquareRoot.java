package elte_2023_fall.unit01;

// Write a program which computes the square root of a number using the Babylonian-method. 
// Given a number , its square root can be approximated by the sequence defined below. 

// Your program should input the real number and another real number. 
// The latter will describe the expected precision of the approximation. 
// Use the double precision floating point type double to store numbers.

// Compute the first few elements of the sequence, 
// until the difference between two consecutive elements is smaller then.

public class SquareRoot {

    public static double compute_next_estimate(double starting, double current) {

        return 0.5d * (current + (starting / current));

    }

    public static void main(String[] args) {
        if (args.length < 2) {
            System.err.println("Insufficient input.");
            System.exit(1);
        }

        double s, delta, curr_estimate, next_estimate;

        s = Double.parseDouble(args[0]);
        delta = Double.parseDouble(args[1]);

        curr_estimate = s / 2.0d;
        next_estimate = compute_next_estimate(s, curr_estimate);

        do {
            System.out.printf("%.6f\n", curr_estimate);

            curr_estimate = next_estimate;
            next_estimate = compute_next_estimate(s, curr_estimate);
        } while ((curr_estimate - next_estimate) > delta);
    }
}
