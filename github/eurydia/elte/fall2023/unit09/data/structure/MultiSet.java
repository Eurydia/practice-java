package github.eurydia.elte.fall2023.unit09.data.structure;

import java.util.HashMap;
import java.util.Map.Entry;

public class MultiSet<E> {
  private HashMap<E, Integer> elemToCount;

  public MultiSet() {
    this.elemToCount = new HashMap<E, Integer>();
  }

  public MultiSet(E[] elements) {
    this();
    for (E e : elements) {
      Integer count = this.elemToCount.get(e);

      if (count == null || count.equals(null)) {
        this.elemToCount.put(e, 1);
        continue;
      }
      this.elemToCount.put(e, count + 1);
    }
  }

  public int add(E e) {
    Integer count = this.elemToCount.get(e);

    if (count == null || count.equals(null)) {
      this.elemToCount.put(e, 1);
      return 1;
    }

    count++;
    this.elemToCount.put(e, count);
    return count;
  }

  public int getCount(E e) {
    Integer count = this.elemToCount.get(e);

    if (count == null || count.equals(null)) {
      return 0;
    }

    return count;

  }

  public MultiSet<E> intersect(MultiSet<E> other) {
    var insectedSet = new MultiSet<E>();

    for (Entry<E, Integer> entry : this.elemToCount.entrySet()) {

      E e = entry.getKey();

      int thisECount = this.getCount(e);
      int otherECount = other.getCount(e);

      int minCount = Math.min(thisECount, otherECount);

      if (minCount != 0) {
        for (int i = 1; i <= minCount; i++) {
          insectedSet.add(e);
        }
      }
    }

    return insectedSet;

  }

  public int size() {
    int size = 0;

    for (Integer c : this.elemToCount.values()) {
      size += c;
    }

    return size;

  }

  public int countExcept(E e) {
    return this.size() - this.getCount(e);
  }

}
