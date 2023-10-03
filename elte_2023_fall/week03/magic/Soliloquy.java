package elte_2023_fall.week03.magic;

import elte_2023_fall.week03.magic.library.Incantation;

public class Soliloquy {

    public void printStatus(Incantation inc1, Incantation inc2) {
        System.out.printf("%d;%s;%d;%s\n", inc1.getIndex(), inc1.text, inc2.getIndex(), inc2.text);
    }

    public void reciteIncantations(Incantation inc1, Incantation inc2, int idx, boolean startWithAppend) {
        System.out.printf("%b;", inc1.enchant(inc2, !startWithAppend));
        printStatus(inc1, inc2);
        inc1.setIndex(idx);

        System.out.printf("%b;", inc1.enchant(inc2, startWithAppend));
        printStatus(inc1, inc2);
        System.out.printf("%b;", inc1.enchant(inc2, true));
        printStatus(inc1, inc2);

    }

    public static void main(String[] args) {
        Incantation inc1 = new Incantation(args[0], Integer.parseInt(args[1]));
        Incantation inc2 = new Incantation(args[2], Integer.parseInt(args[3]));
        Incantation inc3 = new Incantation(inc2);

        Soliloquy q = new Soliloquy();
        q.reciteIncantations(inc1, inc2, Integer.parseInt(args[4]), true);
        inc1.setIndex(Integer.parseInt(args[4]));
        q.reciteIncantations(inc1, inc3, Integer.parseInt(args[4]), false);
    }

}
