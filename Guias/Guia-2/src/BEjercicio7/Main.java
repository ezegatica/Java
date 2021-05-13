package BEjercicio7;
// Indicar y justificar el resultado que se obtiene al ejecutar el siguiente
// programa:
public class Main {
    public static void main(String[] args) {
        Integer[][] matriz = new Integer[2][2];
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[1][0] = 3;
        matriz[1][1] = 4;
        for (Integer[] fila : matriz) {
            for (Integer columna : fila) {
                System.out.print(columna);
            }
            fila[1] = fila[0] + 3;
            System.out.println();
        }
        for (Integer[] fila : matriz) {
            for (Integer columna : fila) {
                System.out.print(columna);
            }
            System.out.println();
        }
    }
}
