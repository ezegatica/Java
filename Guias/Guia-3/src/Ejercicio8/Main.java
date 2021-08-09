package Ejercicio8;

public class Main {
    public static void main(String[] args) throws Exception {
        Person homer = new Person("Homer", 1234, 40);
        Person lisa = new Person("Lisa", 234, 8);
        Pair2 <Person> pair2 = new Pair2<>(homer,lisa);
        System.out.println(pair2.min()); //Lisa
    }
}