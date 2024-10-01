package github.eurydia.elte.fall2023.unit10.cafe;

public abstract class Guest {

  protected String name;
  protected int age;

  public abstract String getName();

  public abstract int getAge();

  public Guest(String name, int age) {
    this.name = name;
    this.age = age;
  }

}
