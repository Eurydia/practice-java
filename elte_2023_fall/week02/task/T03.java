package elte_2023_fall.week02.task;

public class T03 {
    public static void main(String[] args) {
        Complex alpha = new Complex(3, 2);
        Complex beta = new Complex(1, 2);

        alpha.add(beta);
        System.out.println(alpha.asString());

    }
}
