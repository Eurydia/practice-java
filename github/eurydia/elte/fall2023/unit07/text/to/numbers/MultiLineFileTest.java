package github.eurydia.elte.fall2023.unit07.text.to.numbers;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class MultiLineFileTest {
  @Test()
  public void emptyFile() {

    assertDoesNotThrow(() -> assertEquals(38, MultiLineFile.addNumbers(
        "github\\eurydia\\elte\\fall2023\\unit07\\text\\to\\numbers\\tests\\comma_sep.txt",
        ",".charAt(0))));

  }

  @Test
  public void commaSeparatedFile() {
    assertDoesNotThrow(() -> assertEquals(38, MultiLineFile.addNumbers(
        "github\\eurydia\\elte\\fall2023\\unit07\\text\\to\\numbers\\tests\\comma_sep.txt",
        ",".charAt(0))));
  }

  @Test
  public void spaceSeparatedFile() {
    assertDoesNotThrow(() -> assertEquals(38, MultiLineFile.addNumbers(
        "github\\eurydia\\elte\\fall2023\\unit07\\text\\to\\numbers\\tests\\space_sep.txt",
        " ".charAt(0))));
  }

}