package github.eurydia.elte.fall2023.unit07.textfile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Statistics {

  public static int numberOfLines(String filePathWithName) {
    try (BufferedReader fileReader = new BufferedReader(new FileReader(filePathWithName))) {
      int lineCount = 0;
      while (fileReader.readLine() != null) {
        lineCount++;
      }

      return lineCount;
    } catch (FileNotFoundException e) {
      return 0;
    } catch (IOException e) {
      return 0;
    }
  }

  public static int numberOfCharacters(String filePathWithName) {
    try (BufferedReader fileReader = new BufferedReader(new FileReader(filePathWithName))) {
      int wordCount = 0;
      String line;
      while ((line = fileReader.readLine()) != null) {
        wordCount += line.length();
      }

      return wordCount;
    } catch (FileNotFoundException e) {
      return 0;
    } catch (IOException e) {
      return 0;
    }
  }

}
