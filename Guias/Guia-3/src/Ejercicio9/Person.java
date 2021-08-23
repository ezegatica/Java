package Ejercicio9;

public class Person implements Comparable<Person> {
    private String name;
    private int dni;
    private int edad;

    Person(String name, int dni, int edad) {
        this.name = name;
        this.dni = dni;
        this.edad = edad;
    }

    @Override
    public int compareTo(Person p) {
        return Integer.compare(edad, p.edad);
    }

    @Override
    public String toString() {
        return name;
    }
    public String getName(){
        return name;
    }
}