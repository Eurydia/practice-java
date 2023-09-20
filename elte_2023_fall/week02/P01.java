// Create the method conjugate() in class Complex, which turns a complex number

// to its conjugate. Create the method reciprocate() as well, which turns the
// complex number to its reciprocal. Implement the div(c) method, which divides
// the complex number with the other complex number c provided as parameter.

package elte_2023_fall.week02;

public class P01 {

    public static void main(String[] args) {
        Complex a = new Complex(6, 3);
        Complex b = new Complex(7, -5);

        a.div(b);

        System.out.println(a);

    }
}