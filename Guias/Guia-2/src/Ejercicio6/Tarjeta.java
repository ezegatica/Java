package Ejercicio6;

public class Tarjeta {
    private int dni; 

    public Tarjeta(){
        
    }

    public int retirar(int valor) {
        return valor;
    }

    public Tarjeta(int d) {
        dni = d;
    }

    public int getUser() {
        return this.dni;
    }

    // public int retirar(){
    //     System.out.println("hola")
    // }
}
