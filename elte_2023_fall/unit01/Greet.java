package elte_2023_fall.unit01;

public class Greet {
    public static void main(String[] args) {
        System.console().printf("What is you name?\n");
        String name = System.console().readLine();
        System.console().printf("Hello %s", name);

    }
}