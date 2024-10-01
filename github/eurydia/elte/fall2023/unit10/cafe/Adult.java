package github.eurydia.elte.fall2023.unit10.cafe;

public class Adult extends Guest {

  @Override
  public int getAge() {
    return this.age;
  }

  @Override
  public String getName() {
    return this.name;
  }

  public Adult(String name, int age) {
    super(name, age);
  }

}
