package elte_2023_fall.week01.task;

public class T3Greet {
    public static void main(String[] args) {
        System.console().printf("What is you name?\n");
        String name = System.console().readLine();
        System.console().printf("Hello %s", name);

    }
}