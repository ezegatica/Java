package BEjercicio3;

public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(2, 2);
        System.out.println(point1.returnXandY()); // (2,2)
        Point point2 = new Point(2, 2);
        System.out.println(point1.equals(point2));// true
        Point pointIlegal = new Point(-1, -1);
        // Exception in thread "main" java.lang.IllegalArgumentException: no se aceptan
        // números menores a 1
        pointIlegal.returnXandY();
    }
}
