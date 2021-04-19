package BEjercicio3;

public class MainB {
    public static void main(String[] args) {
        Point point1 = new Point(5,6);
        System.out.println(point1.returnXandY()); // (2,2)
        point1.factorial();
        System.out.println(point1.returnXandY());//(120,720)
        }
}
