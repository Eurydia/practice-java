package github.eurydia.elte.fall2023.unit02;

public class Circle {
    double posX;
    double posY;
    double radius;

    public Circle(double posX, double posY, double radius) {

        this.posX = posX;
        this.posY = posY;
        this.radius = radius;
    }

    public void enlarge(double factor) {
        this.radius *= factor;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

}