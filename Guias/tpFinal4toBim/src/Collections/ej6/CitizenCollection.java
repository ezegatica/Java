package Collections.ej6;

import java.util.List;

public interface CitizenCollection {

    void addCitizen(Citizen citizen);

    List<Citizen> findByLastName(String lastName);

    Citizen findByName(String firstName, String lastName);

}
