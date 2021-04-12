package Ejercicio5;

public class Persona {
    private String nombre;
    private String apellido;
    public Persona(String n, String a){
        nombre = n;
        apellido = a;
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public Persona Clone(){
        return this;
    }
}