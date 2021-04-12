package Ejercicio2;


public class Main {
    public static void main(String[] args) throws Exception {
        int Ai = 1;
        int Bi = 2;
        int Ci = 3;
        int Di = 4;
        int a = Ai;
        int b = Bi;
        int c = Ci;
        int d = Di;
        System.out.println("Valores iniciales:" );
        System.out.println("A: " + a + " B: " + b + " C: " + c + " D: " + d);
        b = Ci;
        c = Ai;
        a = Di;
        d = Bi;
        System.out.println("Valores finales:" );
        System.out.println("A: " + a + " B: " + b + " C: " + c + " D: " + d);
    }
}
