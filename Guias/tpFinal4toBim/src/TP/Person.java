package TP;

public abstract class Person { //Clase padre de persona, para no reescribir los parametros de DNI y de Nombre
    private int dni;
    private String nombre;
    public Person(int dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }
    //2 funciones, una para obtener el dni y otra para obtener el nombre
    public String getNombre() {
        return nombre;
    }
    public int getDni() {
        return dni;
    }
}
