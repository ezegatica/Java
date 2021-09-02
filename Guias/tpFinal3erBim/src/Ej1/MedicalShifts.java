package Ej1;

public class MedicalShifts implements Comparable<MedicalShifts> {
    private int lugar;
    private String nombre;

    public MedicalShifts(String nombre, int lugar) {
        this.lugar = lugar;
        this.nombre = nombre;
    }

    public int getLugar() {
        return lugar;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return getNombre() + " - " + getLugar();
        // return getNombre();
    }

    @Override
    public int compareTo(MedicalShifts p) {
        return Integer.compare(lugar, p.lugar);
    }
}
