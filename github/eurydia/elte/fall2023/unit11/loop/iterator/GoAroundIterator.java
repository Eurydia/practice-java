package github.eurydia.elte.fall2023.unit11.loop.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class GoAroundIterator<T> implements Iterator<T> {
  private int idx;
  private int round;
  private int roundCount;
  private List<T> elements;

  public GoAroundIterator(int roundCount, List<T> elements) {

    this.idx = -1;
    this.round = 0;
    this.roundCount = roundCount;

    this.elements = new ArrayList<T>();

    for (T element : elements) {
      this.elements.add(element);
    }
  }

  @Override
  public boolean hasNext() {
    if (this.round == this.roundCount) {
      return false;
    }

    if (this.idx + 1 >= this.elements.size() && this.round + 1 == this.roundCount) {
      return false;
    }

    return true;
  }

  @Override
  public T next() {
    if (this.round >= this.roundCount) {
      throw new NoSuchElementException();
    }

    this.idx++;
    if (this.idx >= this.elements.size()) {
      this.idx = 0;
      this.round++;
    }

    return this.elements.get(this.idx);
  }

}
