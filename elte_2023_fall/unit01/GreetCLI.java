package elte_2023_fall.unit01;

public class GreetCLI {
    public static void main(String[] args) {

        if (args.length < 1) {
            System.console().printf("I do not know your name :(");
            System.exit(1);
        }

        System.console().printf("Hello %s", args[0]);
    }
}