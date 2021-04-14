package Ejercicio6;

public class Debito extends Tarjeta{
    private int dni;
    private int cantidad;
    public Debito(int d, int ca){
        dni = d;
        cantidad = ca;
    }
    public Debito (int d){
        dni = d;
        cantidad = 0;
    }

    public int retirar(int c){
        if (cantidad - c <= 0){
            int c2 = this.cantidad;
            this.cantidad = 0;
            return this.cantidad;
        }

        this.cantidad -= c;
        return c;
    }
    public String ingresar(int c){
        this.cantidad += c;
        return "Ingresado!";
    }
    public int getCantidad() {
        return cantidad;
    }
    public int getDni() {
        return dni;
    }
}
