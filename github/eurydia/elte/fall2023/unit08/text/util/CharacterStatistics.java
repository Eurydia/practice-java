package github.eurydia.elte.fall2023.unit08.text.util;

import java.util.HashMap;
import java.util.Map.Entry;

public class CharacterStatistics {

  private HashMap<Character, Integer> charToCount;

  @Override
  public String toString() {
    var stringBuilder = new StringBuilder();

    for (Entry<Character, Integer> entry : this.charToCount.entrySet()) {
      stringBuilder.append(String.format("%c(%d) ", entry.getKey(), entry.getValue()));
    }

    return stringBuilder.toString().stripTrailing();
  }

  public CharacterStatistics(String string) {

    this.charToCount = new HashMap<Character, Integer>();

    char[] stringCharArray = string.toCharArray();
    for (char c : stringCharArray) {

      Integer charCount = this.charToCount.get(c);

      if (charCount == null) {
        this.charToCount.put(c, 1);
        continue;
      }
      this.charToCount.put(c, charCount + 1);

    }

  }

  public int getCount(char c) {
    Integer charCount = this.charToCount.get(c);

    if (charCount == null) {
      return 0;
    }

    return charCount;

  }

}
