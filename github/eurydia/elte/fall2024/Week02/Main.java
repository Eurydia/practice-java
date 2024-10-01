package Week02;

import Week02.Character.MainCharacter;
import Week02.Character.Orc.OrcBerserker;

public class Main {
    public static void main(String[] args) {
        MainCharacter hero = new MainCharacter("Hero", 100, 9, 1.05F);
        OrcBerserker floppy = new OrcBerserker("Froppy", 100, 20);

        while (hero.isAlive() && floppy.isAlive()) {
                floppy.attack(hero);
            if (hero.isAlive()) {
                hero.attack(floppy);
            }
        }
        if (hero.isAlive()) {
            System.out.println(hero.getName() + " wins");
        } else if (floppy.isAlive()) {
            System.out.println(floppy.getName() + " wins");
        } else {
            System.out.println("Uh oh :(");
        }

    }
}
