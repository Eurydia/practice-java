package elte_2023_fall.unit01;

public class T8Factorial {
    public static void main(String[] args) {

        if (args.length < 1) {
            System.err.println("Insufficient input");
            System.exit(1);

        }

        int x, y, z, i;

        x = 1;
        y = 1;
        z = 1;

        int n = Integer.parseInt(args[0]);
        for (i = 0; i <= n; i++) {
            x = y;
            y = z;
            z = x + y;
        }

        System.out.println(x);

    }
}