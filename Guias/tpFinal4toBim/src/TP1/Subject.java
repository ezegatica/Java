package TP1;

public class Subject {
    private Teacher profe;
    private int id;
    private String nombre;

    public Subject(Teacher profe, int id, String nombre) {
        this.profe = profe;
        this.id = id;
        this.nombre = nombre;
    }

    public void addStudent(Student estudiante) {
        // añadir estudiante
    }

    public void getTpManagment() {
        // es para ordenar los tp en el orden de quien tiene mayor promedio, si dos
        // tienen el mismo promedio es por orden de llegada
    }

    public void deliver(TP tp) {
        // Entregar el orto/tp
    }

    public void correct() {
        // Corregir el primero
    }
}
