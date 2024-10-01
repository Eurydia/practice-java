package github.eurydia.elte.fall2023.unit07.textfile.lookup;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FileContentTest {
  @Test
  public void doesNotExistInEmptyFile() {
    assertEquals(0, FileContent
        .contentLineCount("github\\eurydia\\elte\\fall2023\\unit07\\textfile\\lookup\\tests\\empty_file.txt", "9"));
  }

  @Test
  public void doesNotExistInSampleFile() {
    assertEquals(0, FileContent
        .contentLineCount("github\\eurydia\\elte\\fall2023\\unit07\\textfile\\lookup\\tests\\sample_file.txt", "9"));
  }

  @Test
  public void existInSampleFile() {
    assertEquals(5, FileContent
        .contentLineCount("github\\eurydia\\elte\\fall2023\\unit07\\textfile\\lookup\\tests\\sample_file.txt", "1"));
  }

  @Test
  public void existInSampleFile2() {
    assertEquals(4, FileContent
        .contentLineCount("github\\eurydia\\elte\\fall2023\\unit07\\textfile\\lookup\\tests\\sample_file.txt", "2"));
  }

  @Test
  public void existMultiple() {
    assertArrayEquals(new int[] { 1, 2, 3, 4, 5 }, FileContent
        .contentLineNumbers("github\\eurydia\\elte\\fall2023\\unit07\\textfile\\lookup\\tests\\sample_file.txt", "1"));
  }

  @Test
  public void doesNotExistMultiple() {
    assertArrayEquals(new int[0], FileContent
        .contentLineNumbers("github\\eurydia\\elte\\fall2023\\unit07\\textfile\\lookup\\tests\\sample_file.txt", "9"));
  }

}
