package aver;

import java.util.*;

public class Subject{
    private Teacher profesor;
    private int id;
    private String nombre;
    private Set<Student> estudiantes;
    private TPManagement tpManagement;

    public Subject(Teacher profesor, int id, String nombre){
        this.profesor = profesor;
        this.id = id;
        this.nombre = nombre;
        this.estudiantes = new HashSet<>();
        this.tpManagement = new TPManagement(estudiantes);
    }

    public void addStudent(Student estudiante){
        estudiantes.add(estudiante);
    }

    public TPManagement getTpManagment(){
        return tpManagement;
    }

    @Override
    public String toString(){
        return "{"+profesor+", "+id+", "+nombre+"}";
    }
}