package github.eurydia.elte.fall2023.unit07.text.to.numbers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SingleLineFile {
  public static int addNumbers(String fileName) throws IOException {
    int total = 0;
    String line;

    try (FileReader fileReader = new FileReader(fileName);) {
      BufferedReader bufferedReader = new BufferedReader(fileReader);
      line = bufferedReader.readLine();
      if (line == null) {
        throw new IllegalArgumentException("Empty file");
      }
    } catch (IllegalArgumentException e) {
      throw e;
    }

    for (String word : line.split(" ")) {
      try {
        total += Integer.parseInt(word);
      } catch (NumberFormatException e) {
        System.err.println(word);
      }
    }
    return total;
  }
}
