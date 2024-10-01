package github.eurydia.elte.fall2023.unit10.cafe;

public class Minor extends Guest {

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public int getAge() {
    return this.age;
  }

  public Minor(String name, int age) {
    super(name, age);
  }

}
