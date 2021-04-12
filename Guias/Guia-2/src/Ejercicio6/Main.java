package Ejercicio6;

public class Main {
    public static void main(String[] args) {
        Tarjeta t1 = new Credito(2288888);
        Tarjeta t2 = new Debito(22888888);
        Tarjeta t3 = new Debito(22888888, 1000);
        Debito t4 = new Debito(22888888, 1000);
        Tarjeta tarjetas[] = { t1, t2, t3, t4 };
        Usuario Homero = new Usuario(2288888, "Homero", tarjetas);
        System.out.println(t2.retirar(100));// 0
        System.out.println(t1.retirar(10));// 10
        System.out.println(t3.retirar(100));// 100
        t4.ingresar(100);
        System.out.println(t4.getCantidad());// 1100
    }
}
