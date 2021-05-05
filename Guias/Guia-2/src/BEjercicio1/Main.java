package BEjercicio1;

// ¿Qué salida se obtiene? ¿Por qué?
    // Se obtiene un Distinto, porque son 2 instancias completamente diferentes, aunque el contenido sea el mismo, 
    // estan alocadas en diferentes ubicaciones. 
// a) Cambiando únicamente la generación de s1 y s2.
// b) Cambiando únicamente el método de comparación.

public class Main {
    public static void main(String[] args) {
        String s1, s2;
        s1 = new String("hola");
        // a)
        // s2 = s1;
        s2 = new String("hola");
        if (s1 == s2) {
        // b)
        // if (s1.equals(s2)){
            System.out.println("Son iguales");
        } else {
            System.out.println("Son distintos");
        }
    }
}
