package github.eurydia.elte.fall2023.unit08.data.structure;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ListUtilTest {

  @Test
  public void divisorZero() {
    assertEquals(new ArrayList<Integer>(), ListUtil.divisors(0));
  }

  @Test
  public void divisorOne() {

    assertEquals(new ArrayList<Integer>(List.<Integer>of(1)), ListUtil.divisors(1));
  }

  @Test
  public void divisor64() {

    assertEquals(new ArrayList<Integer>(List.<Integer>of(1, 2, 4, 8, 16, 32, 64)), ListUtil.divisors(64));
  }

  @Test
  public void sameStartEndEmpty() {

    var stringArrayList = new ArrayList<String>();
    stringArrayList.add("");

    assertEquals(new ArrayList<String>(), ListUtil.withSameStartEnd(stringArrayList));
  }

  @Test
  public void sameStartEndNull() {

    var stringArrayList = new ArrayList<String>();
    stringArrayList.add(null);

    assertEquals(new ArrayList<String>(), ListUtil.withSameStartEnd(stringArrayList));
  }

  @Test
  public void sameStartEndSingleSpace() {

    var stringArrayList = new ArrayList<String>();
    stringArrayList.add(" ");

    assertEquals(stringArrayList, ListUtil.withSameStartEnd(stringArrayList));
  }

  @Test
  public void sameStartEndSingleChar() {

    var stringArrayList = new ArrayList<String>();
    stringArrayList.add("x");

    assertEquals(stringArrayList, ListUtil.withSameStartEnd(stringArrayList));
  }

  @Test
  public void sameStartEndString() {

    var stringArrayList = new ArrayList<String>();
    stringArrayList.add("different start and end?");

    assertEquals(new ArrayList<String>(), ListUtil.withSameStartEnd(stringArrayList));
  }

  @Test
  public void sameStartEndStringB() {

    var stringArrayList = new ArrayList<String>();
    stringArrayList.add("ends and starts the same");

    assertEquals(stringArrayList, ListUtil.withSameStartEnd(stringArrayList));
  }

  @Test
  public void maxToFrontNull() {
    ListUtil.maxToFront(null);
  }

  @Test
  public void maxToFrontEmptyArrayList() {
    var emptyArrayList = new ArrayList<String>();

    ListUtil.maxToFront(emptyArrayList);

    assertEquals(new ArrayList<String>(), emptyArrayList);
  }

  @Test
  public void maxToFrontSingleText() {

    var arrayList = new ArrayList<String>(List.of("Hi"));

    ListUtil.maxToFront(arrayList);

    assertEquals(new ArrayList<String>(List.of("Hi")), arrayList);
  }

  @Test
  public void maxToFrontMultiText() {
    var arrayList = new ArrayList<String>(List.of("can", "you", "succeed"));

    ListUtil.maxToFront(arrayList);

    assertEquals(new ArrayList<String>(List.of("you", "can", "succeed")), arrayList);
  }

  // @Test
  // public void maxToFrontMultiTextVariantB() {
  // var arrayList = new ArrayList<String>(List.of("-123", "2000", "100"));

  // ListUtil.maxToFront(arrayList);

  // // assertEquals(new ArrayList<String>(List.<String>of("2000", "-123",
  // "100")),
  // // arrayList);

  // assertEquals(new ArrayList<String>(List.of("2000", "100", "-123")),
  // arrayList);
  // }

}
