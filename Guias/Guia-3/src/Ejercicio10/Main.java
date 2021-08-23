package Ejercicio10;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        for (Integer element : list) {
            System.out.println(element);
        }
        java.util.Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        // falla
        iterator.next();
    }
}