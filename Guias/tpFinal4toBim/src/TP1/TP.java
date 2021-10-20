package TP1;

public class TP {
    private Subject materia;
    private Student alumno;
    private int id;
    private String nombre;

    public TP(Subject materia, Student alumno, int id, String nombre) {
        this.materia = materia;
        this.alumno = alumno;
        this.id = id;
        this.nombre = nombre;
    }
    public void deliver(TP tp){
        //entregar el tp (agregarlo al array?)
    }
    public String correct() throws EmptyTPsException{
        // throw new EmptyTPsException();
        return "TP from: " + "nombre" + " Name: " + "nombre del tp";
        //corregir el primero y sacarlo de la cola
    }
    public boolean isEmpty(){
        return true; //preguntar si esta vacio el array ashei
    }
    public String studentsTps(){
        return "Array de los tps"; //devolver el array
    }
}
