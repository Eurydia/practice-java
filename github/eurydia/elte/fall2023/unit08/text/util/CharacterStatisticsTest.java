package github.eurydia.elte.fall2023.unit08.text.util;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CharacterStatisticsTest {
  @Test
  public void testVariantEmpty() {
    var charStat = new CharacterStatistics("");
    assertEquals("", charStat.toString());
  }

  @Test
  public void testVariantA() {
    var charStat = new CharacterStatistics("aaaaaaaa");
    assertEquals("a(8)", charStat.toString());
  }

  @Test
  public void testVariantB() {
    var charStat = new CharacterStatistics("HgFeDcBa");
    assertEquals("a(1) B(1) c(1) D(1) e(1) F(1) g(1) H(1)", charStat.toString());
  }

  @Test
  public void testVariantC() {
    var charStat = new CharacterStatistics("a?!_#@{}");
    assertEquals("@(1) a(1) !(1) #(1) {(1) }(1) ?(1) _(1)", charStat.toString());
  }

  @Test
  public void testVariantD() {
    var charStat = new CharacterStatistics("Hello world!");
    assertEquals(" (1) !(1) r(1) d(1) e(1) w(1) H(1) l(3) o(2)", charStat.toString());
  }

}
