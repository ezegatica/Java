package Ejercicio6;

public class Credito extends Tarjeta{
    private int gastado;
    private int dni;
    public int getCantidad(){
        return gastado;
    }
    public int retirar(int c){
        gastado += c;
        return c;
    }
    public Credito(int d){
        dni = d;
    }
}
