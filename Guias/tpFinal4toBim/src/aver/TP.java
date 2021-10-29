package aver;

import java.util.*;

public class TP implements Comparable<TP> {
    private Student alumno;
    private Subject materia;
    private int id;
    private String nombre; // puse este punto y coma

    public TP(Subject materia, Student alumno, int id, String nombre) {
        this.materia = materia;
        this.alumno = alumno;
        this.id = id;
        this.nombre = nombre;
    }

    public Student getAlumno() {
        return alumno;
    }

    public int getPromedioAlumno() {
        return alumno.getPromedio();
    }

    @Override
    public int compareTo(TP otroTP) {
        return Integer.compare(alumno.getPromedio(), otroTP.getAlumno().getPromedio());
    }

    @Override
    public String toString(){
        return "TP from: " + alumno.getNombre() + " Name: " + nombre;
    }
}