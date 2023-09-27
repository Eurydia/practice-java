package elte_2023_fall.week03.plane;

public class Circle {
    private double x = 0;
    private double y = 0;
    private double radius = 1;

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return Math.pow(Math.PI, 2) * this.radius;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setRadius(double radius) {
        if (Double.compare(radius, 0.0) <= 0) {
            throw new IllegalArgumentException(String.format("Radius of cannot be set to %f.", radius));
        }
        this.radius = radius;
    }

}
