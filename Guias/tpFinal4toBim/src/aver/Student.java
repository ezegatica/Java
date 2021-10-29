package aver;

public class Student extends Person { // Clase de estudiante, hereda de la clase Person
  private int promedio;

  public Student(int dni, String nombre, int promedio) {
    super(dni, nombre);
    this.promedio = promedio;
  }

  public String toString() {
    return "{" + "nombre=" + super.getNombre() + ", promedio=" + promedio + "}";
  }

  public int getPromedio() {
    return promedio;
  }
}