package Ejercicio7;

public class Main {
    public static void main(String[] args) {
        Contador c = new Contador();
        System.out.println(c.getCantidad()); // 0
        System.out.println(c.incrementar()); // 1
        System.out.println(c.incrementar()); // 2
        System.out.println(c.decrementar()); // 1
    }
}