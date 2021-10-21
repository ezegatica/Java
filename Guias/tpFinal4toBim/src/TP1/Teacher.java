package TP1;

public class Teacher extends Person {
    // array de materias que da
    public Teacher(int dni, String nombre) {
        super(dni, nombre);
    }

    public void addSubject(Subject materia) {
        // añadir a un array
    }

    public String studentsInOrder() {
        return "Lista de estudiantes"; // mostrar a todos los estudiantes que tiene un profesor en orden alfabético
                                       // por el nombre del estudiante
    }
}
