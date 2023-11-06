package elte_2023_fall.unit01;

public class PrintRange {
    public static void main(String[] args) {

        if (args.length < 2) {
            System.console().printf("Insufficient inputs");
            System.exit(1);
        }

        int i, j, k;

        i = Integer.parseInt(args[0]);
        j = Integer.parseInt(args[1]) + 1;

        for (k = i; k <= j; k++) {
            System.out.println(String.format("%.2f", k / 2.0));
        }
        System.out.println("Altogether " + (j - i + 1) + " numbers are printed.");
    }
}