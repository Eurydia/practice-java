package elte_2023_fall.week01;

public class T5Print {
    public static void main(String[] args) {

        int i;

        for (i = 1; i <= 4; i++) {
            System.out.println(String.format("%.2f", i / 2.0));
        }
        i = 4;
        System.out.println("Altogether " + i + " numbers are printed.");
    }
}