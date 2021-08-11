package Ejercicio9;

public class Pair2<P extends Comparable<P>> {
    private P homero;
    private P lisa;
    private Comparator<T> comparator;

    public Pair2(P homero, P lisa, Comparator<P> comparator) {
        this.homero = homero;
        this.lisa = lisa;
        this.comparator = comparator;
    }
    public P min() {
        if (homero.compareTo(lisa) <= 0) {
            return homero;
        } else
            return lisa;
    }
    

}
