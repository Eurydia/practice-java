package marketplace.droids;

import java.util.*;


// public/[protected]/[]/private


public class Droid {
  private List<DroidPart> parts;
  private int powerLevel;

  public int getPowerLevel(){
    return this.powerLevel;
  } 

  public List<DroidPart> getParts() {
    return new ArrayList<DroidPart>(parts);
    // return this.parts; // Bad approach, break encapsulation, see paper for more info!
  }

  public Droid(List<DroidPart> parts) {
    this.parts = new ArrayList<DroidPart>(parts);
  }

  public void damagePart(DroidPart part, int damage) {}

  public void charge(int chargeAmount) {}

  public String runDiagnostics() {
    return "runDiagnostics";
  }

  public void reducePower(int amount) {}


  @Override
  public String toString() {}
}