package github.eurydia.elte.fall2023.unit10.data.structure.peculiar;

import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;

public class StuffyList<E> extends ArrayList<E> {
  private E neededElement;

  public StuffyList(E neededElement) {
    this.neededElement = neededElement;
    this.clear();
  }

  public boolean add(HashSet<E> elements) {

    boolean hasNeededElement = elements.contains(this.neededElement);

    if (!hasNeededElement) {
      this.clear();
    }
    this.addAll(elements);

    return hasNeededElement;

  }

  public boolean add(E element) {

    boolean isValidElement = element == null || !element.equals(this.neededElement);

    if (isValidElement) {
      this.clear();
    }
    this.addAll(List.of(element));

    return isValidElement;

  }

}
