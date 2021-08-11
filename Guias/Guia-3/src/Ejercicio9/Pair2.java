package Ejercicio9;

public class Pair2<P extends Comparable<P>> {
    private P homero;
    private P lisa;

    public Pair2(P homero, P lisa) {
        this.homero = homero;
        this.lisa = lisa;
    }

    public P min() {
        if (homero.compareTo(lisa) <= 0) {
            return homero;
        } else
            return lisa;
    }

}
