
class Complex {
    double re;
    double im;

    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double abs() {
        return Math.sqrt(Math.pow(this.re, 2) + Math.pow(im, 2));
    }

    public Complex add(Complex other) {
        return new Complex(this.re + other.re, this.im + other.im);
    }

    public Complex sub(Complex other) {
        return new Complex(this.re - other.re, this.im - other.im);
    }

    public Complex mul(Complex other) {

        // (a+bi)(c+di)
        // ac + adi + bci - bd
        // (ac-bd), (ad + bc)

        double a = this.re;
        double b = this.im;
        double c = other.re;
        double d = other.im;

        double re_part = (a * c) - (b * d);
        double im_part = (a * d) + (b * c);

        return new Complex(re_part, im_part);
    }

    public String asString() {
        return String.format("Re=%f, Im=%f", this.re, this.im);
    }
}
