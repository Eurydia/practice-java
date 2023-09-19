package elte_2023_fall.week02.task;

public class Complex {
    double re;
    double im;

    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double abs() {
        return Math.sqrt(Math.pow(this.re, 2) + Math.pow(im, 2));
    }

    public void add(Complex other) {
        this.re += other.re;
        this.im += other.im;
    }

    public void sub(Complex other) {
        this.re -= other.re;
        this.im -= other.im;
    }

    public void mul(Complex other) {

        // (a+bi)(c+di)
        // ac + adi + bci - bd
        // (ac-bd), (ad + bc)

        double a = this.re;
        double b = this.im;
        double c = other.re;
        double d = other.im;

        this.re = (a * c) - (b * d);
        this.im = (a * d) + (b * c);

    }

    public void div(Complex other) {

        double currRe = this.re;
        double currIm = this.im;
        double denom = Math.pow(other.re, 2) + Math.pow(other.im, 2);

        this.re = ((currRe * other.re) - (currIm * other.im)) / denom;
        this.im = ((currRe * other.im) + (currIm * other.re)) / denom;

    }

    public void conjugate() {
        this.im *= (-1);
    }

    public void reciprocate() {
        double currRe = this.re;
        double currIm = this.im;

        double denom = Math.pow(currRe, 2) + Math.pow(currIm, 2);

        this.re = currRe / denom;
        this.im = currIm * (-1) / denom;
    }

    public String asString() {
        return String.format("Re=%f, Im=%f", this.re, this.im);
    }
}
