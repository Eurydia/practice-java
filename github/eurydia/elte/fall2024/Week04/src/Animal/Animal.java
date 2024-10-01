package Animal;

import java.util.ArrayList;

public abstract class Animal {
    protected String name;
    protected int weight_kg;
    protected ArrayList<Integer> food_consumed_amount_da;

    public Animal(String name, int weight_kg, ArrayList<Integer> food_consumed_amount_da) {

        if (name.isBlank()) {
            throw new IllegalArgumentException("Animal has empty name");
        }
        if (weight_kg <= 0) {
            throw new IllegalArgumentException("Weight is non-positive");
        }
        if (food_consumed_amount_da == null) {
            throw new IllegalArgumentException("Uninitialized array list for the food consumed");
        }

        this.name = name;
        this.weight_kg = weight_kg;
        this.food_consumed_amount_da = new ArrayList<Integer>();
        for (var amt : food_consumed_amount_da) {
            // Let's say eating nothing still counts as a meal
            if (amt < 0) {
                throw new IllegalArgumentException("Amount of food eaten in a meal is negative");
            }
            this.food_consumed_amount_da.add(amt);
        }

    }

    public String getName() {
        return this.name;
    }

    public int getAmountEatenDa() {
        int total = 0;
        for (var amt : this.food_consumed_amount_da) {
            total += amt;
        }
        return total;
    }

    public boolean hasEatenALot() {
        return this.getAmountEatenDa() > 100;
    }

    public abstract boolean isMalnourished();
}
