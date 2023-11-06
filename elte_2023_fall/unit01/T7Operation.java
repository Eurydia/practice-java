package elte_2023_fall.unit01;

public class T7Operation {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Insufficient input");
            System.exit(1);
        }

        int i, j;

        i = Integer.parseInt(args[0]);
        j = Integer.parseInt(args[1]);

        System.out.printf("%d + %d = %d\n", i, j, i + j);
        System.out.printf("%d - %d = %d\n", i, j, i - j);
        System.out.printf("%d * %d = %d\n", i, j, i * j);

        if (j != 0) {
            System.out.printf("%d / %d = %.2f\n", i, j, ((double) i) / j);
            System.out.printf("%d %% %d = %d\n", i, j, i % j);
        }
    }
}