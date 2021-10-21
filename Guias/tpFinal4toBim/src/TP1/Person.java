package TP1;

public abstract class Person {
    private int dni;
    private String nombre;
    public Person(int dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public int getDni() {
        return dni;
    }
}
