package Ejercicio4;

public class Main {
    public static void main(String[] args) {
        Persona Homero = new Persona("Homero", "Simpson");
        Persona Homer2 = Homero.Clone();
        System.out.println(Homer2.getNombre());// devuelve Homero
        System.out.println(Homer2.getApellido());// devuelve Simpson
    }
}
