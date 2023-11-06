package elte_2023_fall.unit03.plane.but.not.flying;

import elte_2023_fall.unit03.plane.Circle;
import elte_2023_fall.unit03.plane.PublicCircle;

public class CircleMain {
    public static void main(String[] args) {
        PublicCircle circle = new PublicCircle();
        System.out.println(circle.getArea());

        circle.x = 5;
        circle.y = 2;
        circle.radius = 10;
        System.out.println(circle.getArea());

        Circle sCircle = new Circle();
        sCircle.setX(1);
        sCircle.setY(2);
        sCircle.setRadius(5);
        System.out.println(sCircle.getArea());

        System.out.println(String.format("x=%f, y=%f", sCircle.getX(), sCircle.getY()));

        sCircle.setRadius(-1);
    }
}
