package Ejercicio5;

public class CuentaVIP extends Cuenta {
    private int descuento;

    public CuentaVIP(Persona t, double c, int d) {
        super(t, c);
        if (d > 100 || d < 0) {
            throw new IllegalArgumentException();
        }
        descuento = d;
    }

    public CuentaVIP(Persona t) {
        super(t);
        descuento = 20;
    }

    public CuentaVIP(Persona t, int c) {
        super(t, c);
        descuento = 20;
    }

    public int getDescuento() {
        return descuento;
    }
}
