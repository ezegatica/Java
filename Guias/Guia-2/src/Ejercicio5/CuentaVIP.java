package Ejercicio5;

public class CuentaVIP extends Cuenta {
    private int descuento;
    private Persona titular;
    private double cantidad;
    public CuentaVIP(Persona t, double c, int d){
        if (d >= 100){
            throw new IllegalArgumentException();
        }
        this.titular = t;
        this.cantidad = c;
        descuento = d;
    }
    public CuentaVIP(Persona t){
        this.titular = t;
        this.cantidad = 0;
        descuento = 20; 
    }
    public CuentaVIP(Persona t, int c){
        this.titular = t;
        this.cantidad = c;
        descuento = 20; 
    }
    public int getDescuento(){
        return descuento;
    }
    public Persona getTitular(){
        return titular;
    }
    public double getCant(){
        return cantidad;
    }
}
