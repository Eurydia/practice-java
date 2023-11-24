package github.eurydia.elte.fall2023.unit11.loop;

import java.util.ArrayList;
import java.util.List;

import github.eurydia.elte.fall2023.unit11.loop.iterator.GoAroundIterator;

public class GoAround<T> implements Iterable<T> {

  private int roundCount;
  private List<T> elements;

  public GoAround(int roundCount, T... elements) {
    this.roundCount = roundCount;
    this.elements = new ArrayList<T>();

    for (T element : elements) {
      this.elements.add(element);
    }

  }

  public GoAroundIterator<T> iterator() {
    return new GoAroundIterator<T>(this.roundCount, this.elements);

  }

}
