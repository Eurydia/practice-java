package Week02.Character.Dragon;

public class DragonBlack extends Dragon {

    public DragonBlack(String name, int hp, int damage) {
        super(name, hp, damage, "Black");
    }

    @Override
    public void takeDamage(int points) {
        if (points <= 20) {
            return;
        }
        this.hp -= points;
    }
}
