package TP;

public class TP implements Comparable<TP> { // Clase del TP. Necesitamos el comparable para utilizar el compareTo y
                                            // usarlo en el Sort de TPManagement
  private Student alumno;
  private Subject materia;
  private int id;
  private String nombre;

  public TP(Subject materia, Student alumno, int id, String nombre) {
    this.materia = materia;
    this.alumno = alumno;
    this.id = id;
    this.nombre = nombre;
  }

  public Student getAlumno() {
    return alumno;
  }

  public int getPromedioAlumno() {
    return alumno.getPromedio(); // Usamos el metodo del alumno para devolver el promedio
  }

  @Override
  public int compareTo(TP segundoTP) {
    return Integer.compare(alumno.getPromedio(), segundoTP.getAlumno().getPromedio());
  }

  @Override
  public String toString() {
    return "TP from: " + alumno.getNombre() + " Name: " + nombre;
  }
}