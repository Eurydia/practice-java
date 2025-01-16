package marketplace.persons;

import  marketplace.persons.*;

public class Jawa implements Seller {
  private List<Droid> droidsInStorage;
       // int         x                = 9;
  
  private Map<DroidPart, Integer> partsInStorage; 
  private String name;

  public Jawa(String name){}

  public int sellDroid(List<Droid> buyList){
    
  }
  public int sellDroidParts(List<DroidPart> buyList){}
  private int applyDiscount(int totalPrice){}   
  private double haggle(){}
  public List<Droid> browseDroids() {}
  public Map<DroidPart, Integer> browserDroidParts() {}
  public void addDroidToInventory(Droid droid) {}
  public void restockPart(DroidPart partType, int quantity) {}
  public boolean checkPartAvailability(DroidPart partType, int quantity) {}

  @Override
  public boolean equals(Object a) {}

  @Override
  public int hashCode() {}
} 