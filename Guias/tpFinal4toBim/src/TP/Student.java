package TP;

public class Student extends Person { //Clase del estudiante, hereda la clase Persona
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