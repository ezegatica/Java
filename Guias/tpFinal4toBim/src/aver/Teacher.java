package aver;

import java.util.*;

public class Teacher extends Person {
  private Set<Subject> materias;

  public Teacher(int dni, String nombre) {
    super(dni, nombre);
    materias = new HashSet<>();
  }

  public void addSubject(Subject materia) {
    // agregar a una lista o set de materias que da
    materias.add(materia);
  }

  public String studentsInOrder() {
    return "COMPLETAR2";
  }
}