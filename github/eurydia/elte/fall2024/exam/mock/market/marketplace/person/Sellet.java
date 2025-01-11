package marketplace.persons;

import marketplace.droids.*;

public interface Seller {
  int sellDroid(List<Droid> buyList);
  int sellDroidParts(List<DroidPart> buyList);
} 