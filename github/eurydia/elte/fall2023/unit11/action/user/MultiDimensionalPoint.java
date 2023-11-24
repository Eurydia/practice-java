package github.eurydia.elte.fall2023.unit11.action.user;

import github.eurydia.elte.fall2023.unit11.action.Scalable;
import github.eurydia.elte.fall2023.unit11.action.Undoable;

public class MultiDimensionalPoint implements Scalable, Undoable, Comparable<Object> {

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }

    if (this.getClass() != obj.getClass()) {
      return false;
    }

    final MultiDimensionalPoint other = (MultiDimensionalPoint) obj;

    if (this.coordinates.length != other.coordinates.length) {
      return false;
    }

    for (int i = 0; i < this.coordinates.length; i++) {
      if (this.coordinates[i] != other.coordinates[i]) {
        return false;
      }
    }
    return true;
  }

  @Override
  public int compareTo(Object obj) {

    if (obj == null) {
      throw new NullPointerException();
    }

    if (this.getClass() != obj.getClass()) {
      throw new ClassCastException();
    }

    final MultiDimensionalPoint other = (MultiDimensionalPoint) obj;

    if (this.coordinates.length < other.coordinates.length) {
      return -1;
    }

    if (this.coordinates.length > other.coordinates.length) {
      return 1;
    }

    for (int i = 0; i < this.coordinates.length; i++) {
      if (this.coordinates[i] == other.coordinates[i]) {
        continue;
      }

      if (this.coordinates[i] > other.coordinates[i]) {
        return 1;
      }
      return -1;

    }
    return 0;

  }

  private int[] coordinates;

  private int[] lastCoordinates;

  public MultiDimensionalPoint(int... coordinates) {

    int size = coordinates.length;
    this.coordinates = new int[size];
    this.lastCoordinates = new int[size];

    for (int i = 0; i < size; i++) {
      this.coordinates[i] = coordinates[i];
      this.lastCoordinates[i] = coordinates[i];
    }

  }

  public int get(int dim) {
    if (dim >= this.coordinates.length) {
      return 0;
    }

    return this.coordinates[dim];
  }

  public void set(int dim, int coord) {
    if (dim >= this.coordinates.length) {
      return;
    }

    this.coordinates[dim] = coord;
  }

  @Override
  public void scale(int scaleSize) {

    saveToLast();
    for (int i = 0; i < this.coordinates.length; i++) {
      this.coordinates[i] *= scaleSize;
    }
  }

  private void saveToLast() {
    for (int i = 0; i < this.coordinates.length; i++) {
      this.lastCoordinates[i] = this.coordinates[i];
    }

  }

  @Override
  public void undoLast() {
    for (int i = 0; i < this.coordinates.length; i++) {
      int temp = this.coordinates[i];
      this.coordinates[i] = this.lastCoordinates[i];
      this.lastCoordinates[i] = temp/*  */;
    }

  }
}
