package TP1;

import java.util.*;

public class Subject {
    private Teacher profe;
    private int id;
    private String nombre;
    private Map<Integer, Student> estudiantes;

    // array de estudiantes
    public Subject(Teacher profe, int id, String nombre) {
        this.profe = profe;
        this.id = id;
        this.nombre = nombre;
        this.estudiantes = new TreeMap<>(Comparator.reverseOrder());
    }

    public void addStudent(Student estudiante) {
        // Busqueda por promedio ordenado por promedio descendente
        // O usar como en el ej 6 el 6-7 o el 3-4 

        // estudiantes.put(Integer.parseInt(estudiante.getPromedio()+""+estudiante.getDni()), estudiante); //Te quiero nati, no nos sanciones, esto funciona
    }

    public void getEstudiantes() {
        for (Student dni : estudiantes.values()) {
            System.out.println(dni);
        }
    }

    public TP getTpManagment() {
        return new TP(new Subject(new Teacher(2345, "Severus"), 0, "Defence  Against the  Dark  Arts"),
                new Student(4445, "Harry", 7), 0, "First  TP");
        // es para ordenar los tp en el orden de quien tiene mayor promedio, si dos
        // tienen el mismo promedio es por orden de llegada
    }

    public void correct() {
        // Corregir el primero
    }
}
