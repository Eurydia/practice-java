package elte_2023_fall.week02;

public class Rectangle {
    double upperLeftX;
    double upperLeftY;
    double width;
    double height;

    public Rectangle(double upperLeftX, double upperLeftY, double width, double height) {

        this.upperLeftX = upperLeftX;
        this.upperLeftY = upperLeftY;
        this.width = width;
        this.height = height;
    }

    public Point topLeft() {
        return new Point(this.upperLeftX, this.upperLeftY);
    }

    public Point topRight() {
        return new Point(this.upperLeftX + this.width, this.upperLeftY);
    }

    public Point bottomLeft() {
        return new Point(this.upperLeftX, this.upperLeftY + this.height);
    }

}
