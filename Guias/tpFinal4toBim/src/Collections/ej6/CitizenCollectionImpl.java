package Collections.ej6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CitizenCollectionImpl implements CitizenCollection {

    private Map<String, Map<String, Citizen>> peopleMap = new HashMap<>();

    @Override
    public void addCitizen(Citizen person) {
        if(!peopleMap.containsKey(person.getLastName())) {
            peopleMap.put(person.getLastName(), new HashMap<>());
        }
        peopleMap.get(person.getLastName()).put(person.getFirstName(), person);
    }

    @Override
    public List<Citizen> findByLastName(String lastName) {
        if(!peopleMap.containsKey(lastName)) {
            return new ArrayList<>();
        }
        return new ArrayList<>(peopleMap.get(lastName).values());
    }

    @Override
    public Citizen findByName(String firstName, String lastName) {
        if(!peopleMap.containsKey(lastName)) {
            return null;
        }
        return peopleMap.get(lastName).get(firstName);
    }

}
