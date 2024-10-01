package github.eurydia.elte.fall2023.unit03.plane;

public class PublicCircle {
    public double x = 0;
    public double y = 0;
    public double radius = 1;

    public double getArea() {
        return Math.pow(Math.PI, 2) * this.radius;
    }
}
