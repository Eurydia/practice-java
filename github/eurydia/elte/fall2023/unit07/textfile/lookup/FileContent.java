package github.eurydia.elte.fall2023.unit07.textfile.lookup;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileContent {

  public static int contentLineCount(String filePathWithName, String substring) {
    try (var bufferedReader = new BufferedReader(new FileReader(filePathWithName))) {
      int subStringFoundCount = 0;
      String line;

      while ((line = bufferedReader.readLine()) != null) {
        if (line.indexOf(substring) > -1) {
          subStringFoundCount++;
        }
      }
      return subStringFoundCount;

    } catch (IOException e) {
      return 0;
    }

  }

  public static int[] contentLineNumbers(String filePathWithName, String substring) {
    try (var bufferedReader = new BufferedReader(new FileReader(filePathWithName))) {

      int subStringFoundCount = FileContent.contentLineCount(filePathWithName, substring);

      int[] lineNumbers = new int[subStringFoundCount];
      int lineNumberInsertIndex = 0;
      int lineNumberCurrent = 0;

      bufferedReader.mark(0);
      bufferedReader.reset();

      String line;

      while ((line = bufferedReader.readLine()) != null) {

        lineNumberCurrent++;

        if (line.indexOf(substring) == -1) {
          continue;
        }

        lineNumbers[lineNumberInsertIndex] = lineNumberCurrent;
        lineNumberInsertIndex++;
      }

      return lineNumbers;

    } catch (IOException e) {
      return new int[0];
    }

  }

}
