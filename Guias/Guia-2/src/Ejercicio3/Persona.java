package Ejercicio3;

public class Persona {
    private String nombre;
    private String apellido;
    public Persona(String n, String a){
        this.nombre = n;
        this.apellido = a;
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
}