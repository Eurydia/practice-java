package github.eurydia.elte.fall2023.unit02;

public class CircleMain {
  public static void main(String[] args) {
    Circle circle = new Circle(0, 0, 1);
    circle.enlarge(1);

    System.out.println(circle.getArea());

  }
}
