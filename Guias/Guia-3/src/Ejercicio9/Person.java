package Ejercicio9;

public class Person implements Comparable<Person>{
    private String nombre;
    private int dni;
    private int edad;
    public Person(String nombre, int dni, int edad){
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
    }
    public String getName(){
        return nombre; 
    }
    @Override
    public int compareTo(Person p2){
        return Integer.compare(edad, p2.edad);
    }
    @Override
    public String toString(){
        return nombre;
    }
}
