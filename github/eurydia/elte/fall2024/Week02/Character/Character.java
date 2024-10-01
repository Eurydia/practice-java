package Week02.Character;

public abstract class Character {
    protected String name;
    protected int hp;
    protected int damage;

        public  Character(String name, int hp, int damage) {
            this.damage = damage;
            this.name=name;
            this.hp =hp;
        }

    public String getName() {
        return name;
    }

    public void attack(Character defender) {
        defender.takeDamage(this.damage);
    }

    public boolean isAlive() {
        return hp > 0;
    }

    public abstract void takeDamage(int points);

}
