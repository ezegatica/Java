package Collections.ej1;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Citizen> sortedCitizenSet = new HashSet<>();
        Citizen ct = new Citizen(123, "Hola", "Mundo");
        sortedCitizenSet.add(ct);
        sortedCitizenSet.add(new Citizen(456, "Hello", "World"));
        sortedCitizenSet.add(new Citizen(123, "Hola", "Mundo"));
        for(Citizen citizent : sortedCitizenSet){
        System.out.println(citizent.getDni());
        }
        System.out.println(sortedCitizenSet.contains(ct)); // true
       }
}
