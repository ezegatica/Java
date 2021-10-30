package aver;

import java.util.*; //Importamos para obtener el Set, el Tree y el Hash y sus derivados

public class Subject { // Clase de la materia
    private Teacher profesor;
    private int id;
    private String nombre;
    private Set<Student> estudiantes; // "Array" de estudiantes que la cursan
    private TPManagement tpManagement;

    public Subject(Teacher profesor, int id, String nombre) {
        this.profesor = profesor;
        this.id = id;
        this.nombre = nombre;
        this.estudiantes = new HashSet<>();
        this.tpManagement = new TPManagement();
    }

    public void addStudent(Student estudiante) {
        estudiantes.add(estudiante);
    }

    public TPManagement getTpManagment() {
        return tpManagement;
    }

    public Set<Student> getEstudiantes() {
        return estudiantes;
    }

    @Override
    public String toString() {
        return "{" + profesor + ", " + id + ", " + nombre + "}";
    }
}