package TPViejaVersion;

import java.util.*;

public class Subject {
    private Teacher profe;
    private int id;
    private String nombre;
    // private Map<Integer, Student> estudiantes;
    // Array de tps
    private Map<String, List<Student>> estudiantes;

    // array de estudiantes
    public Subject(Teacher profe, int id, String nombre) {
        this.profe = profe;
        this.id = id;
        this.nombre = nombre;
        // this.estudiantes = new TreeMap<>(Comparator.reverseOrder());
        this.estudiantes = new HashMap<>();
        estudiantes.put("Lista", new ArrayList<>());

    }

    public void addStudent(Student estudiante) {
        // Busqueda por promedio ordenado por promedio descendente
        // O usar como en el ej 6 el 6-7 o el 3-4
        // estudiantes.put(Integer.parseInt(estudiante.getPromedio()+""+estudiante.getDni()),estudiante);
        // //Esto funciona? How
        estudiantes.get("Lista").add(estudiante);
        // System.out.println(estudiantes);
    }

    public void getEstudiantes() {
        System.out.println(estudiantes);
        // for (Student dni : estudiantes.values()) {
        // System.out.println(dni);
        // }
    }

    public Subject getTpManagment() {
        return this;
        // es para ordenar los tp en el orden de quien tiene mayor promedio, si dos
        // tienen el mismo promedio es por orden de llegada
    }

    public void deliver(TP tp) {
        // entregar el tp (agregarlo al array?)
    }

    public String correct() throws EmptyTPsException {
        // throw new EmptyTPsException();
        return "TP from: " + "nombre" + " Name: " + "nombre del tp";
        // corregir el primero y sacarlo de la cola
    }

    public boolean isEmpty() {
        return true; // preguntar si esta vacio el array ashei
    }

    public String studentsTps() {
        return "Array de los tps"; // devolver el array
    }
}
