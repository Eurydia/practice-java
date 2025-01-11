package marketplace.droids;

public class DroidPart {
  private int basePrice;
  private int damage;
  private DroidPartTypes type;

  public int getDamage() {
    return this.damage;
  }

  public void setDamage(int value) {
    this.damage = value;    
  }

  public DroidPartTypes getType() {
    return this.type;
  }

  public DroidPart(int basePrice, int damage, DroidPartTypes type) {
    this.basePrice = basePrice;
    this.damage = damage;
    this.type = type;
  }


  public int getPrice() {}

  public int getRepairCost() {}

  public void upgrade(int priceIncrease) {}
  
  @Override
  public String toString() {}

  // private String name;
  // public String getName() {}
  // public void setName(String value) {}
}



// public class Student {
//   String name
//   int age;
//   long id;
//   @Override
//   public String toString() {
//     return "id:{id},name:{name}"
//   }
// }

// var Korn = new Student();

// System.out.println(Korn);
// >>> id:999,name:Korn