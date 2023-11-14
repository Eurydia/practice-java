package github.eurydia.elte.fall2023.unit04.music.fan;

import github.eurydia.elte.fall2023.unit04.music.recording.Artist;

public class Fan {
  private final String name;
  private final Artist favourite;
  private int moneySpent;

  public Fan(String name, Artist favorite) {
    this.name = name;
    this.favourite = favorite;
  }

  public int buyMerchandise(int cost, Fan... friends) {
    double discountPercent = 0.1 * Math.min(2, friends.length);

    int actualSpending = (int) Math.round(cost * discountPercent);
    this.moneySpent += actualSpending;
    this.favourite.getLabel().gotIncome(actualSpending * (friends.length + 1));

    return actualSpending;
  }

  public boolean favesAtSameLabel(Fan other) {
    return this.favourite.getLabel() == other.getFavourite().getLabel();
  }

  public String getName() {
    return this.name;
  }

  public Artist getFavourite() {
    return this.favourite;
  }

  public int getMoneySpent() {
    return this.moneySpent;
  }

  public String toString1() {
    return this.name + this.favourite.getName() + this.moneySpent;
  }

  public String toString2() {
    return String.format("%s,%s,%d", this.name, this.favourite.getName(), this.moneySpent);
    // return "%s,%s,%d".format(this.name, this.favourite.getName(),
    // this.moneySpent);
  }

  public String toString3() {
    return String.format("%s,%s,%d", this.name, this.favourite.getName(), this.moneySpent);
  }

  public String toString4() {
    var sb = new StringBuilder();
    sb.append(this.name);
    sb.append(this.favourite.getName());
    sb.append(this.moneySpent);
    return sb.toString();
  }

}
