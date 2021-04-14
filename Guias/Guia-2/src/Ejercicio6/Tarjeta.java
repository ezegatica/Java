package Ejercicio6;

public class Tarjeta {
    private Usuario user; 

    public Tarjeta(){
        
    }

    public int retirar(int valor) {
        return valor;
    }

    public Tarjeta(Usuario usr) {
        user = usr;
    }

    public Usuario getUser() {
        return user;
    }

    // public int retirar(){
    //     System.out.println("hola")
    // }
}
