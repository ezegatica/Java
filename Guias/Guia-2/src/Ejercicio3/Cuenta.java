package Ejercicio3;

public class Cuenta {
    private Persona titular;
    private double cantidad;
    public Cuenta(Persona t, double c){
        titular = t;
        cantidad = c;
    }
    public Cuenta(Persona t){
        titular = t;
        cantidad = 0;
    }
    public double getCant(){
        return cantidad;
    }
}

