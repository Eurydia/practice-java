package elte_2023_fall.week02;

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
