class Point {
    double x;
    double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void move(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

    public void mirror(Point p) {

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
}
