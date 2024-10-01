package Week02.Character.Orc;

public class OrcDefender extends Orc {

    public OrcDefender(String name, int hp, int damage) {
        super(name, hp, damage, "Defender");
    }

    @Override
    public void takeDamage(int points) {
        this.hp -= points/2;
    }
}
