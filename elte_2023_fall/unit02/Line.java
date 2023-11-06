
// Create class Line, which can represent lines on a plane. A line is
// characterized by its points , which satisfy the equality

// . The fields of the Line class will be a, b and c, all of type double.

// Create a method contains(p), which decides whether the point p lies on the
// line.

// Create the methods isParallelWith(l) and isOrthogonalTo(l), which decide,
// respectively, whether a line is parallel to, and orthogonal (perpendicular)
// to the line l provided as a parameter.

package elte_2023_fall.unit02;

public class Line {
    public double a;
    public double b;
    public double c;

    public Line(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getSlope() {
        return -(this.a / this.b);
    }

    public boolean contains(Point p) {
        return Double.compare(((p.x * this.a) + (p.y * this.b)), this.c) == 0;
    }

    public boolean isParallelWith(Line l) {
        return Double.compare(this.getSlope(), l.getSlope()) == 0;
    }

    public boolean isOrthogonalTo(Line l) {
        return Double.compare(this.getSlope(), -(1 / l.getSlope())) == 0;

    }

}