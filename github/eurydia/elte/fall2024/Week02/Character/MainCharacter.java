package Week02.Character;

public class MainCharacter extends Character {
    private final float defense;

    public MainCharacter(String name, int hp, int damage,float defense) {
        super(name, hp, damage);
        this.defense = defense;
    }

    @Override
    public void takeDamage(int points) {
        this.hp -= (int) (points / defense);
    }
}
