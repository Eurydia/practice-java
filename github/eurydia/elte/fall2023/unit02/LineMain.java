package github.eurydia.elte.fall2023.unit02;

public class LineMain {
    public static void main(String[] args) {

        Point p = new Point(0, 0);
        Segment s = new Segment(0, 0, 1, 1);
        Line l = s.line();
        System.out.println(l.contains(p));
    }
}