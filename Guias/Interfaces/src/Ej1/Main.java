package Ej1;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayIntegerList array1 = new ArrayIntegerList(6);
        array1.add(1);
        array1.add(4);
        array1.add(2);
        array1.add(6);
        array1.add(10);
        System.out.println(array1.contains(1));
        array1.remove(0);
        System.out.println(array1.contains(1));
        System.out.println(array1);
    }
}
