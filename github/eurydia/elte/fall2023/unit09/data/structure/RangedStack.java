package github.eurydia.elte.fall2023.unit09.data.structure;

import java.util.ArrayList;
import java.util.LinkedList;

public class RangedStack<T> {
  private LinkedList<T> elems;

  public RangedStack() {
    this.elems = new LinkedList<T>();
  }

  public RangedStack(RangedStack<T> rangedStack) {
    this();

    for (T e : rangedStack.elems) {
      this.elems.add(e);
    }

  }

  public ArrayList<T> pop(int count) {
    var result = new ArrayList<T>();

    for (int i = 1; i <= count; i++) {
      if (this.elems.size() == 0) {
        return result;

      }
      result.add(this.elems.removeLast());
    }

    return result;
  }

  public void push(T... elems) {

    for (T e : elems) {
      this.elems.add(e);
    }
  }

}
