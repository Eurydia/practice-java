package Animal;

import java.util.ArrayList;

public class AnimalGoat extends Animal {
    public AnimalGoat(String name, int weight_kg, ArrayList<Integer> food_consumed_amount_da) {
        super(name, weight_kg, food_consumed_amount_da);
    }

    @Override
    public boolean isMalnourished() {
        return this.weight_kg < 12;
    }
}
