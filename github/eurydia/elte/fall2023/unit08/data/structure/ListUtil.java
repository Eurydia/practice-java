package github.eurydia.elte.fall2023.unit08.data.structure;

import java.util.ArrayList;
import java.util.Collections;

public class ListUtil {

  public static ArrayList<Integer> divisors(int n) {

    if (n < 0) {
      throw new IllegalArgumentException("Negative number give.");
    }

    var divisorArrayList = new ArrayList<Integer>();

    for (int i = 1; i <= n; i++) {
      if (n % i == 0) {
        divisorArrayList.add(i);
      }

    }

    return divisorArrayList;

  }

  public static ArrayList<String> withSameStartEnd(ArrayList<String> strings) {

    var result = new ArrayList<String>();

    for (String string : strings) {
      if (string == null || string.isEmpty()) {
        continue;
      }
      char fstChar = string.charAt(0);
      char lstChar = string.charAt(string.length() - 1);

      if (fstChar != lstChar) {
        continue;
      }

      result.add(string);

    }

    return result;

  }

  public static void maxToFront(ArrayList<String> strings) {
    if (strings == null || strings.size() == 0) {
      return;
    }

    String maxString = Collections.max(strings);

    int maxStringIndex = 0;
    for (int i = 0; i < strings.size(); i++) {
      if (strings.get(i).equals(maxString)) {
        maxStringIndex = i;
      }
    }

    strings.remove(maxStringIndex);
    strings.add(0, maxString);

  }

}
