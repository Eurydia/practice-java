package github.eurydia.elte.fall2023.unit10.cafe;

public class Bartender {

  private int legalAge;

  public Bartender(int legalAge) {
    this.legalAge = legalAge;
  }

  public boolean order(Guest g) {
    return g.getAge() >= this.legalAge;
  }

}
