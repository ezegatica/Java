package Sets;
import java.util.Collections;


public class Citizen{
    private int dni;
    private String nombre;
    private String apellido;

    public Citizen(int dni, String nombre, String apellido) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public String getDni() {
        return String.valueOf(dni);
    }
}
