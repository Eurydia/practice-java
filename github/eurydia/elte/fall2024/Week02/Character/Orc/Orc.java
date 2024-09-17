package Week02.Character.Orc;


public abstract class Orc extends Week02.Character.Character {
    private String archetype;
    public Orc(
            String name,
            int hp,
            int damage,
            String archetype
    ) {
        super(name, hp, damage);
        this.archetype = archetype;
    }

}
