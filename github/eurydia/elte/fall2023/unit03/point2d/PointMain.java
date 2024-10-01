package github.eurydia.elte.fall2023.unit03.point2d;

class PointMain {
  public static void main(String[] args) {

    Point p = new Point(0, 0);
    System.out.println(p.toString()); // 0, 0
    p.move(3, 5);
    System.out.println(p.toString()); // 3, 5
    p.mirror(1, 1);
    System.out.println(p.toString()); // -1, -3

    Point q = new Point(1, 1);

    System.out.println(p.toString()); // 0, 0
    p.move(3, 5);
    System.out.println(p.toString()); // 3, 5
    p.mirror(q);
    System.out.println(p.toString()); // -1, -3

    System.out.println(p.distance(p)); // 0
  }
}
