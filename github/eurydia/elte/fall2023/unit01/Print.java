package github.eurydia.elte.fall2023.unit01;

public class Print {
    public static void main(String[] args) {

        int i;

        for (i = 1; i <= 4; i++) {
            System.out.println(String.format("%.2f", i / 2.0));
        }
        i = 4;
        System.out.println("Altogether " + i + " numbers are printed.");
    }
}