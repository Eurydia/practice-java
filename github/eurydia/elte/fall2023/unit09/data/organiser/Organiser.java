package github.eurydia.elte.fall2023.unit09.data.organiser;

import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;

public class Organiser<T> {

  @Override
  public String toString() {

    var stringBuilder = new StringBuilder();

    stringBuilder.append("[");

    for (T elem : this.elems) {
      if (elem == null || elem.equals(null)) {
        continue;
      }
      stringBuilder.append(String.format("%s ", elem.toString()));
    }

    stringBuilder.append("]");

    return stringBuilder.toString();

  }

  private ArrayList<T> elems;

  private ArrayList<Entry<Integer, Integer>> swaps;

  @SafeVarargs
  public Organiser(T... elems) {
    this.elems = new ArrayList<T>();
    for (T t : elems) {
      this.elems.add(t);
    }

  }

  public void addSwap(int a, int b) {

    Entry<Integer, Integer> pair = Map.entry(a, b);
    this.swaps.add(pair);
  }

  public ArrayList<T> get() {

    var result = new ArrayList<T>();
    for (int i = 0; i < this.elems.size(); i++) {
      result.add(this.get(i));
    }
    return result;

  }

  public T get(int a) {
    return this.elems.get(a);
  }

  private void swap(int a, int b) {
    T aElem = this.get(a);
    T bElem = this.get(b);

    this.elems.set(b, aElem);
    this.elems.set(a, bElem);

  }

  public void runSwaps() {

    for (Entry<Integer, Integer> swap : this.swaps) {
      this.swap(swap.getKey(), swap.getValue());
    }
  }

}
