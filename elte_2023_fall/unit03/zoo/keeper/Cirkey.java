package elte_2023_fall.unit03.zoo.keeper;

import elte_2023_fall.unit03.zoo.animal.Panda;

public class Cirkey {
    public static void main(String[] args) {
        Panda a = new Panda("A", "China");
        Panda b = new Panda(5, "China");

        a.happyBirthday(9);
        b.happyBirthday(6);
    }
}
