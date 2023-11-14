package github.eurydia.elte.fall2023.unit07.text.to.numbers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;

public class SingleLineFileTest {
  @Test
  public void emptyFile() {
    Throwable exception = assertThrows(IllegalArgumentException.class, () -> SingleLineFile.addNumbers(
        "github\\eurydia\\elte\\fall2023\\unit07\\text\\to\\numbers\\tests\\empty_file.txt"));
    assertEquals("Empty file", exception.getMessage());
  }

  @Test
  public void commaSepFile() {
    try {
      assertEquals(38, MultiLineFile.addNumbers(
          "github\\eurydia\\elte\\fall2023\\unit07\\text\\to\\numbers\\tests\\comma_sep.txt",
          ",".charAt(0)));
    } catch (Exception e) {

    }
  }

  @Test
  public void spaceSepFile() {
    try {
      assertEquals(38, MultiLineFile.addNumbers(
          "github\\eurydia\\elte\\fall2023\\unit07\\text\\to\\numbers\\tests\\space_sep.txt",
          " ".charAt(0)));
    } catch (Exception e) {

    }
  }

}