package github.eurydia.elte.fall2023.unit11.action.user;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class MultiDimensionalPointTest {
  @Test
  public void testInitUndo() {

    var mp = new MultiDimensionalPoint(0, 0, 0);

    int[] initCoord = new int[3];
    for (int i = 0; i < 3; i++) {
      initCoord[i] = mp.get(i);
    }

    assertArrayEquals(new int[] { 0, 0, 0 }, initCoord);

    mp.undoLast();

    int[] undoL = new int[3];
    for (int i = 0; i < 3; i++) {
      undoL[i] = mp.get(i);
    }

    assertArrayEquals(new int[] { 0, 0, 0 }, undoL);

    mp.undoLast();

    int[] undoP = new int[3];
    for (int i = 0; i < 3; i++) {
      undoP[i] = mp.get(i);
    }

    assertArrayEquals(new int[] { 0, 0, 0 }, undoP);
  }

  @Test
  public void testSet() {

    var mp = new MultiDimensionalPoint(0, 0, 0);

    mp.set(0, 1);

    int[] initCoord = new int[3];
    for (int i = 0; i < 3; i++) {
      initCoord[i] = mp.get(i);
    }

    assertArrayEquals(new int[] { 1, 0, 0 }, initCoord);

    mp.undoLast();

    int[] undoL = new int[3];
    for (int i = 0; i < 3; i++) {
      undoL[i] = mp.get(i);
    }

    assertArrayEquals(new int[] { 0, 0, 0 }, undoL);

    mp.undoLast();

    int[] undoP = new int[3];
    for (int i = 0; i < 3; i++) {
      undoP[i] = mp.get(i);
    }

    assertArrayEquals(new int[] { 1, 0, 0 }, undoP);
  }

  @Test
  public void testEquality() {

    var mpA = new MultiDimensionalPoint(1, 1, 1);
    var mpB = new MultiDimensionalPoint(1, 1, 1);

    int[] initCoordA = new int[3];
    int[] initCoordB = new int[3];

    for (int i = 0; i < 3; i++) {
      initCoordA[i] = mpA.get(i);
      initCoordB[i] = mpB.get(i);
    }
    assertArrayEquals(initCoordA, initCoordB);
  }
}
