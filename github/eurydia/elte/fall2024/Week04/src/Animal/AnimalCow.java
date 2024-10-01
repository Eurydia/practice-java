package Animal;

import java.util.ArrayList;

public class AnimalCow extends  Animal {
    private static final int weight_threshold_kg = 100;

    public AnimalCow(String name, int weight_kg, ArrayList<Integer> food_consumed_amount_da) {
        super(name, weight_kg, food_consumed_amount_da);
    }

    @Override
    public boolean isMalnourished() {
        return this.weight_kg < weight_threshold_kg;
    }
}
