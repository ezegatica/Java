package Ejercicio9;

public class Pair2<T extends Comparable<T>> {
  private T value1;
  private T value2;
  private Comparator<T> fc;

  public Pair2(T value1, T value2, Comparator<T> fc) {
    this.value1 = value1;
    this.value2 = value2;
    this.fc = fc;
  }

  public T min() {
    if (value1.compareTo(value2) <= 0) {
      return value1;
    } else {
      return value2;
    }
  }

  public T max() {
    if (fc.compare(value1, value2) >= 0) {
      return value1;

    } else {
      return value2;
    }
  }
}
