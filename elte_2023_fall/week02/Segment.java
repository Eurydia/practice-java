package elte_2023_fall.week02;

public class Segment {
    double x_1;
    double x_2;
    double y_1;
    double y_2;

    public Segment(double x_1, double y_1, double x_2, double y_2) {
        this.x_1 = x_1;
        this.y_1 = y_1;
        this.x_2 = x_2;
        this.y_2 = y_2;
    }

    public Line line() {
        // Ax + By = C

        double m = (this.y_2 - this.y_1) / (this.x_2 - this.x_2);

        // y2 - y1 = m(x2 - x1)
        // y2 = m(x2 - x1) + y1
        // y2 = mx2 - mx1 + y1
        // y2 - mx2 = -mx1 + y1

        // A = -m
        // B = 1
        // C = -mx1 + y1

        return new Line(-m, 1, this.y_1 - (m * this.x_1));
    }

    public boolean contains(Point p) {

        Line l = this.line();

        if (!l.contains(p)) {
            return false;
        }

        double x_min = Math.min(x_2, x_1);
        double x_max = Math.max(x_2, x_1);

        if (p.x < x_min || p.x > x_max) {
            return false;
        }

        double y_min = Math.min(y_2, y_1);
        double y_max = Math.max(y_2, y_1);

        if (p.y < y_min || p.y > y_max) {
            return false;
        }
        return true;
    }

    public double orientation(Point p) {
        return ((this.y_2 - this.y_1) * (p.x - this.x_2)) - ((p.y - this.y_2) * (this.x_2 - this.x_1));
    }

    public boolean intersect(Segment s) {
        // Create a method intersect(s) which decides whether a segment intersects with
        // another segment s given as parameter. You can use the following tutorial.

        Point p1 = new Point(this.x_1, this.y_1);
        Point p2 = new Point(this.x_2, this.y_2);
        Point p3 = new Point(s.x_1, s.y_1);
        Point p4 = new Point(s.x_2, s.y_2);

        double o1 = this.orientation(p3);
        double o2 = this.orientation(p4);
        double o3 = s.orientation(p1);
        double o4 = s.orientation(p2);

        return o1 != o2 && o3 != o4;
    }

}
