// Compute an approximation of using the following continued fraction..

public class P5 {

    public static double compute_next_estimate(double starting, double current) {

        return 0.5d * (current + (starting / current));

    }

    public static void main(String[] args) {

        double curr_estimate, next_estimate;

        curr_estimate = s / 2.0d;
        next_estimate = compute_next_estimate(s, curr_estimate);

    }
}
