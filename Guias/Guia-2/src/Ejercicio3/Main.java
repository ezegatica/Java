package Ejercicio3;

public class Main {
    public static void main(String[] args) {
        Persona Homero = new Persona("Homero","Simpson");
        Cuenta cuenta1 = new Cuenta(Homero, 10);
        Persona Lisa = new Persona("Lisa","Simpson");
        Cuenta cuenta2 = new Cuenta(Lisa);
        System.out.println(cuenta1.getCant());
        System.out.println(cuenta2.getCant());
    }
}

