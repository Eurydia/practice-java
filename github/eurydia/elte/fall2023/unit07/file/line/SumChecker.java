package github.eurydia.elte.fall2023.unit07.file.line;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SumChecker {
  private static int[] getNumbers(String line) {

    String[] splittedLine = line.split(" ");

    String[] choiceStrings = splittedLine[1].split(",");

    int nubmerOfChoices = choiceStrings.length;
    int[] choiceInts = new int[nubmerOfChoices];

    for (int i = 0; i < nubmerOfChoices; i++) {
      choiceInts[i] = Integer.parseInt(choiceStrings[i]);
    }

    int targetInt = Integer.parseInt(splittedLine[0]);

    for (int i = 0; i < nubmerOfChoices; i++) {
      for (int j = i + 1; j < nubmerOfChoices; j++) {
        if (choiceInts[i] + choiceInts[j] == targetInt) {
          return new int[] { choiceInts[i], choiceInts[j] };
        }
      }
    }

    return new int[] { 0 };

  }

  public static void main(String[] args) {
    try (var bufferedReader = new BufferedReader(
        new FileReader("github\\eurydia\\elte\\fall2023\\unit07\\file\\line\\tests\\sum_input.txt"))) {

      try (var fileWriter = new FileWriter(
          "github\\eurydia\\elte\\fall2023\\unit07\\file\\line\\tests\\sum_output.txt")) {

        String line;
        while ((line = bufferedReader.readLine()) != null) {
          int[] result = SumChecker.getNumbers(line);

          String targetIntString = line.split(" ")[0];

          if (result.length == 1) {
            fileWriter.append(String.format("%s none\n", targetIntString));
            continue;
          }

          fileWriter.append(String.format("%s=%d+%d\n", targetIntString, result[0], result[1]));

        }

      } catch (IOException e) {
        return;
      }

    } catch (FileNotFoundException e) {
      return;
    } catch (IOException e) {
      return;
    }

  }

}
