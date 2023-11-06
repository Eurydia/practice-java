package elte_2023_fall.unit01;
// Change the previous program in such a way that it computes how many perfect numbers are 

// in the range between 1 and the number given as the first command-line argument.

public class PerfectNumberRange {

    public static boolean is_perfect(int n) {
        int divisor_sum = 1, i;

        for (i = 2; i < (n / 2) + 1; i++) {
            if ((n % i) == 0) {
                divisor_sum += i;
            }
        }

        return (divisor_sum == n) || ((divisor_sum * 2) == n);
    }

    public static void main(String[] args) {
        if (args.length < 1) {
            System.err.println("Insufficient input.");
            System.exit(1);
        }

        int n, i, perfect_num_counter = 0;
        n = Integer.parseInt(args[0]);

        for (i = 2; i < n + 1; i++) {
            if (is_perfect(i)) {
                perfect_num_counter++;
            }
        }

        System.out.printf("There are %d perfect numbers between 1 and %d.\n", perfect_num_counter, n);

    }
}
