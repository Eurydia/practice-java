// class Point {
//     double x;
//     double y;

//     // Good Job, please put each class in a separate file

//     public Point(double x, double y) {
//         this.x = x;
//         this.y = y;
//     }

//     public void move(double dx, double dy) {
//         this.x += dx;
//         this.y += dy;
//     }

//     public void mirror(Point p) {
//         // :(
//         // throw new UnsupportedOperationException();

//         this.move(2 * (p.x - this.x), 2 * (p.y - this.y));
//     }

//     public double distance(Point p) {
//         return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
//     }

//     public String asString() {
//         return String.format("x=%f, y=%f", this.x, this.y);
//     }
// }

public class T02 {
    public static void main(String[] args) {
        Point p = new Point(0, 0);
        Point q = new Point(1, 1);

        System.out.println(p.asString()); // 0, 0
        p.move(3, 5);
        System.out.println(p.asString()); // 3, 5
        p.mirror(q);
        System.out.println(p.asString()); // -1, -3

        System.out.println(p.distance(p)); // 0

    }
}
