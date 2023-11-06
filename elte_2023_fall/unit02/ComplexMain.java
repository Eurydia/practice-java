package elte_2023_fall.unit02;

public class ComplexMain {
  public static void main(String[] args) {
    Complex alpha = new Complex(3, 2);
    Complex beta = new Complex(1, 2);

    alpha.add(beta);
    System.out.println(alpha.toString()); // 4.0 + 4.0i

    Complex a = new Complex(6, 3);
    Complex b = new Complex(7, -5);

    a.div(b);

    System.out.println(a);

  }
}
