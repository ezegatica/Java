package Collections.ej2;

import java.util.Objects;

public class Citizen implements Comparable<Citizen> {
    private int dni;
    private String firstName, lastName;

    public Citizen(int dni, String firstName, String lastName) {
        this.dni = dni;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public int compareTo(Citizen o) {
        return Integer.compare(dni, o.dni);
    }

    public int getDni() {
        return dni;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Citizen{" + "dni='" + dni + '\'' + ", firstName='" + firstName + '\'' + ", lastName='" + lastName + '\''
                + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Citizen))
            return false;
        Citizen citizen = (Citizen) o;
        return dni == citizen.dni && firstName.equals(citizen.firstName) && lastName.equals(citizen.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni, firstName, lastName);
    }
}
