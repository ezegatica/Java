package aver;

import java.util.*;

public class Student extends Person {
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