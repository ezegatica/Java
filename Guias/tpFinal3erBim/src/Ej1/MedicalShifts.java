package Ej1;

public class MedicalShifts {
    private int lugar;
    private String nombre;
    public MedicalShifts(String nombre, int lugar){
        this.lugar = lugar;
        this.nombre = nombre;
    }
    public int getLugar(){
        return lugar;
    }
    public String getNombre(){
        return nombre;
    }
}
