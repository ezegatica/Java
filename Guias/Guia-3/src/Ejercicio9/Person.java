package Ejercicio9;

public class Person implements Comparable<Person> {
    private String nombre;
    private int DNI;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public Person(String nombre, int DNI, int edad) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.edad = edad;
    }

    @Override
    public int compareTo(Person p) {
        return Integer.compare(edad, p.edad);
    }

    @Override
    public String toString() {
        return nombre;
    }

}
