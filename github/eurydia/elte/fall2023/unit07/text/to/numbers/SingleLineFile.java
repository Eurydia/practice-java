package github.eurydia.elte.fall2023.unit07.text.to.numbers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SingleLineFile {
  public static int addNumbers(String fileName) throws IOException {

    try (FileReader fileReader = new FileReader(fileName);) {

      BufferedReader bufferedReader = new BufferedReader(fileReader);

      String line = bufferedReader.readLine();

      if (line == null) {
        throw new IllegalArgumentException("Empty file");
      }

      int total = 0;

      for (String w : line.split(" ")) {
        try {
          total += Integer.parseInt(w);
        } catch (NumberFormatException e) {
          System.err.println(w);
        }
      }
      return total;
    } catch (IllegalArgumentException e) {
      throw e;
    }
  }
}
