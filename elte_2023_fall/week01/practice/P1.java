package elte_2023_fall.week01.practice;
// Create a program which takes its first command-line argument as an integer number, 

// and decides whether this number is a perfect number. 
// In number theory, a natural number is called perfect, if the sum of its positive divisors 
// (excluding the number itself) is equal to the number. 
// (Or, equivalently, the sum of the positive divisors equals to two times the number.) 
// The first four perfect numbers are: 6, 28, 496 and 8128. For example, .

public class P1 {

    public static void main(String[] args) {
        if (args.length < 1) {
            System.err.println("Insufficient input.");
            System.exit(1);
        }

        int n, i, divisor_sum = 1;
        n = Integer.parseInt(args[0]);

        for (i = 2; i < (n / 2) + 1; i++) {
            if ((n % i) == 0) {
                divisor_sum += i;
            }
        }

        boolean is_perfect = (divisor_sum == n) || ((divisor_sum * 2) == n);

        System.out.printf("%d is a perfect number: %b\n", n, is_perfect);

    }
}