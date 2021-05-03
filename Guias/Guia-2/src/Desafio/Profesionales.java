package Desafio;

public abstract class Profesionales {
    private int dni;
    private String nombre;
    private int sueldo;
    public Profesionales(int dni, String nombre, int sueldo){
        this.dni = dni;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }
}
