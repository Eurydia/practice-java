
public class T01 {
    public static void main(String[] args) {
        Point p = new Point(0, 0);
        System.out.println(p.asString()); // 0, 0
        p.move(3, 5);
        System.out.println(p.asString()); // 3, 5
        p.mirror(1, 1);
        System.out.println(p.asString()); // -1, -3
    }
}