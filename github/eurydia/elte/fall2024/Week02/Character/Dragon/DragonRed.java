package Week02.Character.Dragon;

public class DragonRed extends Dragon {

    public DragonRed(String name, int hp, int damage) {
        super(name, hp, damage, "Red");
    }

    @Override
    public void takeDamage(int points) {
        if (points <= 60) {
            return;
        }
        this.hp -= points;
    }
}
