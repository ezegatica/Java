package aver;

import java.util.*;

public class Subject { // Clase de la materia
  private Set<Student> estudiantes;
  private Teacher profe;
  private int id;
  private String nombre;
  private TPManagement tpManagement;

  public Subject(Teacher profe, int id, String nombre) {
    this.profe = profe;
    this.id = id;
    this.nombre = nombre;
    this.estudiantes = new HashSet<>();
    this.tpManagement = new TPManagement();
  }

  public void addStudent(Student estudiante) {
    this.estudiantes.add(estudiante);
  }

  public TPManagement getTpManagment() {
    return this.tpManagement;
  }

  @Override
  public String toString() {
    return "{" + profe + ", " + id + ", " + nombre + "}";
  }
}