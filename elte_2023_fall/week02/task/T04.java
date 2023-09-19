package elte_2023_fall.week02.task;
// Create a class Circle representing circles with an origin (fields x and y of

// type double) and a radius (field of type double). Create a method enlarge(f),
// which multiplies the radius with f, enlarging the circle with a factor f (or
// shrinking if f is smaller than 1). Create a method getArea() which computes
// the area of the circle. Use the constant Math.PI!

public class T04 {

    public static void main(String[] args) {

        Circle circle = new Circle(0, 0, 1);
        circle.enlarge(1);

        System.out.println(circle.getArea());

    }
}