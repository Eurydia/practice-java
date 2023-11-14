package github.eurydia.elte.fall2023.unit07.text.to.numbers;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class SingleLineFileTest {
  @Test
  public void emptyFile() {
    assertThrows("Empty file", IllegalArgumentException.class, () -> SingleLineFile.addNumbers(
        "github\\eurydia\\elte\\fall2023\\unit07\\text\\to\\numbers\\tests\\empty_file.txt"));
  }

  @Test
  public void spaceSepFile() {
    assertDoesNotThrow(
        () -> assertEquals(20, SingleLineFile
            .addNumbers("github\\eurydia\\elte\\fall2023\\unit07\\text\\to\\numbers\\tests\\space_sep.txt")));

  }

}