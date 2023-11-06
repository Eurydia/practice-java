package elte_2023_fall.unit04.famous.sequence;

public class Fibonacci {

    public static int fib(int n) {
        int a = 0;
        int b = 1;
        int c, i;
        for (i = 0; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return a;
    }

}
