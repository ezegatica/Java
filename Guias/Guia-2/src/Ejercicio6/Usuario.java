package Ejercicio6;

public class Usuario {
    private int dni;
    private String nombre;
    private Tarjeta[] tarjeta;
    
    public Usuario(int d, String n, Tarjeta[] t){
        dni = d;
        nombre = n;
        tarjeta = t;
    }
} 
