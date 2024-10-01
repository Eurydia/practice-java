package github.eurydia.elte.fall2023.unit03.zoo.keeper;

import github.eurydia.elte.fall2023.unit03.zoo.animal.Panda;

public class Cirkey {
    public static void main(String[] args) {
        Panda a = new Panda("A", "China");
        Panda b = new Panda(5, "China");

        a.happyBirthday(9);
        b.happyBirthday(6);
    }
}
