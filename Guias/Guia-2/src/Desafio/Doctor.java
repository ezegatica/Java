package Desafio;

public class Doctor extends Profesionales{
    private int cantidadPacientes;
    private String especialidad;
    public Doctor(int sueldo, int dni, String nombre, int cantidadPacientes, String especialidad) {
        super(dni, nombre, sueldo);
        this.cantidadPacientes = cantidadPacientes;
        this.especialidad = especialidad;
    }
    public Doctor(int sueldo, int dni, String nombre) {
        super(dni, nombre, sueldo);
        this.cantidadPacientes = 1;
        this.especialidad = "general";
    }
    public String getSpecialty(){
        return this.especialidad;
    }
}
