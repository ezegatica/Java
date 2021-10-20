package Collections.ej6;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Citizen uno = new Citizen(111, "Uno", "One");
        Citizen dos = new Citizen(222, "Dos", "Two");

        // Colección para busqueda por DNI (DNI -> Una instancia)
        Map<Integer, Citizen> byDniMap = new HashMap<>();
        byDniMap.put(uno.getDni(), uno);
        byDniMap.put(dos.getDni(), dos);
        System.out.println(byDniMap);
        System.out.println(" 1 ");

        //Recorro las claves
        for (Integer key : byDniMap.keySet()) {
            System.out.println(key);
        }
        System.out.println(" 2 ");

        //Recorro los valores
        for(Citizen citizen: byDniMap.values()){
            System.out.println(citizen);
        }
        System.out.println();
        for(Map.Entry value: byDniMap.entrySet()){
            System.out.println(value);
        }
        System.out.println(" 3 ");

        // Colección para busqueda por nombre (Nombre -> Varias instancias)
        Map<String, List<Citizen>> byNameMap = new HashMap<>();
        byNameMap.put(uno.getFirstName(), new ArrayList<>());
        byNameMap.get(uno.getFirstName()).add(uno);
        byNameMap.get("Uno").add(
                new Citizen(123, "Uno", "Tres"));
        System.out.println(byNameMap);
        System.out.println(" 4 ");

        // Colección para busqueda por Nombre y despues por Apellido
        Map<String, Map<String, List<Citizen>>> byNameAndLastNameMap = new HashMap<>();
        byNameAndLastNameMap.put(uno.getFirstName(), new HashMap<>());
        byNameAndLastNameMap.get(uno.getFirstName()).put(uno.getLastName(), new ArrayList<>());
        byNameAndLastNameMap.get(uno.getFirstName()).get(uno.getLastName()).add(uno);
        System.out.println(byNameAndLastNameMap);
        System.out.println(" 5 ");

        // Busqueda por DNI ordenado por DNI ascendente
        Map<Integer, Citizen> sortedByDniMap = new TreeMap<>();
        sortedByDniMap.put(uno.getDni(), uno);
        sortedByDniMap.put(dos.getDni(), dos);
        for(Integer dni: sortedByDniMap.keySet()){
            System.out.println(dni);
        }
        System.out.println(" 6 ");

        // Busqueda por DNI ordenado por DNI descendente
        Map<Integer, Citizen> reversedSortedByDniMap = new TreeMap<>(
                Comparator.reverseOrder());
        reversedSortedByDniMap.put(uno.getDni(), uno);
        reversedSortedByDniMap.put(dos.getDni(), dos);
        for(Integer dni: reversedSortedByDniMap.keySet()){
            System.out.println(dni);
        }
        System.out.println(" 7 ");

    }
}
