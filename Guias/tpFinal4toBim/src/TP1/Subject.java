package TP1;

public class Subject {
    private Teacher profe;
    private int id;
    private String nombre;
    //array de estudiantes
    public Subject(Teacher profe, int id, String nombre) {
        this.profe = profe;
        this.id = id;
        this.nombre = nombre;
    }

    public void addStudent(Student estudiante) {
        // añadir estudiante
    }

    public TP getTpManagment() {
        return new TP(new Subject(new Teacher(2345, "Severus"), 0, "Defence  Against the  Dark  Arts"), new Student(4445, "Harry", 7), 0, "First  TP");
        // es para ordenar los tp en el orden de quien tiene mayor promedio, si dos
        // tienen el mismo promedio es por orden de llegada
    }

    public void correct() {
        // Corregir el primero
    }
}
