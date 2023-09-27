package elte_2023_fall.week02;

class Point {
    double x;
    double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public void move(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

    public void mirror(Point p) {
        this.mirror(p.x, p.y);
    }

    public void mirror(double cx, double cy) {
        // :(
        // throw new UnsupportedOperationException();

        this.move(2 * (cx - this.x), 2 * (cy - this.y));
    }

    public double distance(Point p) {
        return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
    }

    public String asString() {
        return String.format("x=%f, y=%f", this.x, this.y);
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point p = new Point(1, 1);

        // a.mirror(1, 1);
        a.mirror(p);
        a.asString();

    }
}
