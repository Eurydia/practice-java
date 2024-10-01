import Animal.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

//A text file contains data about an animal farm. Each animal is identified by its name. An animal can be a cow, a horse, a goat, or an emu. The first line of the file contains the number of animals n. The next n lines each contain the type of the animal (C-Cow, H-Horse, G-Goat, E-Emu), its name, its weight, the number of times it has eaten today, and the amount of food consumed for each meal in decagrams.
//An example file looks like this:
//        3
//E Evelyn 32 4 20 30 30 20
//G Gabriel 21 3 30 40 50
//C Charlie 134 8 20 40 20 30 10 20 40 50
//Read the file. Report a list of animals that are malnourished. An animal is malnourished if its weight is less than k kilograms, where k=100 for cows, k=60 for horses, k=12 for goats, and k=20 for emus. Also give a list of animals that consumed more than 1 kg food today.
//Try to solve the problem without using the number of animals. Throw an exception if you encounter an error when opening or while reading the file.
//Create an abstract Animal class and subclass it for the four types of animals.
public class Main {
    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            throw new IllegalArgumentException("Missing file name");
        }


        String file_name = args[0];
        BufferedReader br = new BufferedReader(new FileReader(file_name));
        String line = br.readLine();
        int line_count = Integer.parseInt(line);
        ArrayList<Animal> anims = new ArrayList<Animal>(line_count);
        while (line_count > 0) {
            line = br.readLine();
            String[] toks = line.split(" ");


            String anim = toks[0];
            String name = toks[1];
            int weight_kg = Integer.parseInt(toks[2]);
            int meal_count = Integer.parseInt(toks[3]);
            ArrayList<Integer> food_consumed_deca = new ArrayList<Integer>(meal_count);
            for (int i = 0; i < meal_count; i++) {
                food_consumed_deca.add(Integer.parseInt(toks[i + 4]));
            }
            // Delegate the input validation to constructors
            switch (anim) {
                case "C":
                    anims.add(new AnimalCow(name, weight_kg, food_consumed_deca));
                    break;
                case "H":
                    anims.add(new AnimalHorse(name, weight_kg, food_consumed_deca));
                    break;
                case "E":
                    anims.add(new AnimalEmu(name, weight_kg, food_consumed_deca));
                    break;
                case "G":
                    anims.add(new AnimalGoat(name, weight_kg, food_consumed_deca));
                    break;
                default:
                    throw new IllegalArgumentException("Unknown animal identifier");
            }
            line_count--;
        }
        // Malnourished
        System.out.println("Malnourished:");
        for (var anim : anims) {
            if (anim.isMalnourished()) {
                System.out.println(anim.getName());
            }
        }
        System.out.println("---");
        // Malnourished
        System.out.println("Has eaten a lot:");
        for (var anim : anims) {
            if (anim.hasEatenALot()) {
                System.out.println(anim.getName());
            }
        }
        System.out.println("---");
    }
}