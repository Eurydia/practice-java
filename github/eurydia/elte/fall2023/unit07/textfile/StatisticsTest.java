package github.eurydia.elte.fall2023.unit07.textfile;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StatisticsTest {
  @Test
  public void fileLineCountCorrect() {
    assertEquals(0,
        Statistics.numberOfLines("github\\eurydia\\elte\\fall2023\\unit07\\textfile\\tests\\empty_file.txt"));
    assertEquals(5,
        Statistics.numberOfLines("github\\eurydia\\elte\\fall2023\\unit07\\textfile\\tests\\sample_file.txt"));

  }

  @Test
  public void fileCharCountCorrect() {
    assertEquals(0,
        Statistics.numberOfCharacters("github\\eurydia\\elte\\fall2023\\unit07\\textfile\\tests\\empty_file.txt"));
    assertEquals(5,
        Statistics.numberOfCharacters("github\\eurydia\\elte\\fall2023\\unit07\\textfile\\tests\\sample_file.txt"));

  }

}
