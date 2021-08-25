package Sets;

public class Main {
    static void main(String[] args) {
        // Set de Citizen
        Set<Citizen> citizenSet = new HashSet<>();
        citizenSet.add(new Citizen(123, "Hola", "Mundo"));
        citizenSet.add(new Citizen(456, "Hello", "World"));
        citizenSet.add(new Citizen(123, "Hola", "Mundo"));
        citizenSet.forEach(citizen -> System.out.println(citizen.getDni()));
    }
}
