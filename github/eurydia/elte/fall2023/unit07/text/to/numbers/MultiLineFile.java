package github.eurydia.elte.fall2023.unit07.text.to.numbers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MultiLineFile {

  public static int addNumbers(String fileName, char sep) throws IOException {
    int total = 0;
    String sepString = Character.toString(sep);

    try (FileReader fileReader = new FileReader(fileName);) {
      BufferedReader bufferedReader = new BufferedReader(fileReader);
      String line;
      while ((line = bufferedReader.readLine()) != null && line.length() > 0) {

        System.out.println(line.split(sepString));
        for (String word : line.split(sepString)) {
          try {
            total += Integer.parseInt(word);
          } catch (NumberFormatException e) {
            // System.err.println(word);
          }
        }
      }
    } catch (IllegalArgumentException e) {
      throw e;
    } catch (IOException e) {
      throw e;
    }
    return total;
  }

}
