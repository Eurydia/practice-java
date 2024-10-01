package Week02.Character.Dragon;
import Week02.Character.Character;

public abstract  class Dragon extends Character {
    protected String color;
    public Dragon(String name, int hp, int damage, String color) {
        super(name, hp, damage);
        this.color = color;
    }
}
