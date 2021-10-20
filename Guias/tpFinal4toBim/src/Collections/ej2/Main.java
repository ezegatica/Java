package Collections.ej2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Citizen> sortedCitizenSet = new TreeSet<>();
        sortedCitizenSet.add(new Citizen(123, "Hola", "Mundo"));
        sortedCitizenSet.add(new Citizen(456, "Hello", "World"));
        sortedCitizenSet.add(new Citizen(123, "Adios", "Mundo"));
        sortedCitizenSet.forEach(citizen -> System.out.println(citizen.getDni()));
        System.out.println();
    }
}
