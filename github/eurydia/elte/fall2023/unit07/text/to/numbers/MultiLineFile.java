package github.eurydia.elte.fall2023.unit07.text.to.numbers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MultiLineFile {

  public static int addNumbers(String fileName, char sep) throws IOException {
    int sum = 0;
    String sepString = Character.toString(sep);

    try (FileReader fileReader = new FileReader(fileName);) {
      BufferedReader bufferedReader = new BufferedReader(fileReader);
      String line;
      while ((line = bufferedReader.readLine()) != null) {
        String fstWord = line.split(sepString)[0];
        try {
          sum += Integer.parseInt(fstWord);
        } catch (NumberFormatException e) {
          System.err.println(fstWord);
        }
      }
    } catch (IllegalArgumentException e) {
      throw e;
    } catch (IOException e) {
      throw e;
    }
    return sum;
  }

}