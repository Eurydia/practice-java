package Week02.Character.Orc;

public class OrcFighter extends Orc {

    public OrcFighter(String name, int hp, int damage) {
        super(name, hp, damage, "Fighter");
    }

    @Override
    public void takeDamage(int points) {
        this.hp -= points;
    }
}
