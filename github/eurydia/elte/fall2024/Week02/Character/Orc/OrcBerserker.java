package Week02.Character.Orc;

public class OrcBerserker extends Orc {
    public OrcBerserker(
            String name,
            int hp,int damage
    ) {
        super(name, hp, damage, "Berserker");
    }

    @Override
    public void takeDamage(int points) {
        this.hp -= points * 2;
    }
}
