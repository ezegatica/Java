package Desafio;

public class Teacher extends Profesionales {
    private int cantidadAlumnos;
    private String materia;

    public Teacher(int sueldo, int dni, String nombre, int cantidadAlumnos, String materia) {
        super(dni, nombre, sueldo);
        this.cantidadAlumnos = cantidadAlumnos;
        this.materia = materia;
    }

    public int getStudent() {
        return this.cantidadAlumnos;
    }

    public String getSubject() {
        return this.materia;
    }
}
