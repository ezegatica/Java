package aver;

import java.util.*;

public class Teacher extends Person { // Clase del profesor, hereda la clase Persona
    private Set<Subject> materias; // "Array" de materias

    public Teacher(int dni, String nombre) {
        super(dni, nombre);
        materias = new HashSet<>(); // Inicializamos el array de materias
    }

    public void addSubject(Subject materia) { // Agregamos una materia al array
        materias.add(materia);
    }

    public String studentsInOrder() {
        // mostrar a todos los estudiantes que tiene un profesor en orden alfabético
        // por el nombre del estudiante
        Set<String> nombres = new TreeSet<String>(); //Creamos un treeset de nombres de estudiantes

        for (Subject materia : materias) { //Ciclamos la lista de materias que da el profe
            Set<Student> estudiantes = materia.getEstudiantes(); //Agarramos los estudiantes de cada materia
            estudiantes.forEach(estudiante -> nombres.add(estudiante.getNombre())); //Añadimos al array de nombres los estudiantes de cada materia
        }
        return nombres.toString(); //Como el array de nombres es un treeset de orden natural, se devolveran en orden alfabetico
    }
}