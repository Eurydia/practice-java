package elte_2023_fall.unit03.game;

import elte_2023_fall.unit03.game.utils.Vehicle;

public class Main {
    public static void main(String[] args) {
        Player p1 = new Player();
        p1.vehicle = new Vehicle(1, 2, 99, "BBK");
        Player p2 = new Player();

        System.out.println(p1.toString());
        System.out.println(p2.toString());

    }
}
