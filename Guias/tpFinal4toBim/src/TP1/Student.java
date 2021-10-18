package TP1;

public class Student extends Person{
    private int promedio;
    public Student(int dni, String nombre, int promedio){
        super(dni, nombre);
        this.promedio = promedio;
    }
    public void deliver(TP tp) {
        // Entregar el tp
    }
}
