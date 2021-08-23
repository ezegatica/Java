package Ejercicio9;

public class Main {
    public static void main(String[] args) {
        Person homer = new Person("Homero", 1234, 40);
        Person lisa = new Person("Lisa", 234, 8);
        Pair2<Person> pair2 = new Pair2<>(homer, lisa, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().length() - o2.getName().length();
            }
        });
        System.out.println(pair2.min());
        System.out.println(pair2.max());
    }
}