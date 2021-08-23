package Ejercicio8;

public class Pair2<T extends Comparable<T>> {
    private T value1;
    private T value2;

    public Pair2(T value1, T value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public T min() {
        if (value1.compareTo(value2) <= 0) {
            return value1;
        } else
            return value2;
    }

}
