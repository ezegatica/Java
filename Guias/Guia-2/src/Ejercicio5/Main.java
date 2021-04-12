package Ejercicio5;

public class Main {
    public static void main(String[] args) {
        Persona Homero = new Persona("Homero", "Simpson");
        Persona Lisa = new Persona("lisa", "Simpson");
        Cuenta cuenta2 = new Cuenta(Lisa);

        CuentaVIP cuentaVip1 = new CuentaVIP(Homero, 10, 20);
        System.out.println(cuentaVip1.getDescuento());// 20
        CuentaVIP cuentaVip2 = new CuentaVIP(Lisa, 30);
        System.out.println(cuentaVip1.getDescuento());// 20

        // CuentaVIP cuentaVip3 = new CuentaVIP(Lisa, 1000, 1000);// IllegalArgumentException

    }
}
