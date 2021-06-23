package Pairs_1;

public class Main {
    public static void main(String[] args) {
        Pair<String, Double> stringDoublePair = new Pair<>("hola", 0.1);
        System.out.println(stringDoublePair); // [hola, 0.1]
        Pair<Integer, Integer> integerIntegerPair = new Pair<>(1, 2);
        System.out.println(integerIntegerPair); // [1, 2]
    }
}
