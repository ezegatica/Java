package Ejercicio9;

public class Pair2<T extends Comparable<T>> {
  private T value1;
  private T value2;
  private Comparator<T> comparator;

  public Pair2(T value1, T value2, Comparator<T> comparator) {
    this.value1 = value1;
    this.value2 = value2;
    this.comparator = comparator;
  }

  public T max() {
    int c = comparator.compare(value1, value2);
    if (c >= 0)
      return value1;
    return value2;
  }

  public T min() {
    if (value1.compareTo(value2) <= 0)
      return value1;
    else
      return value2;
  }
}