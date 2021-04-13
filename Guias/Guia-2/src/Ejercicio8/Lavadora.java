package Ejercicio8;

public class Lavadora extends Electrodomestico{
    private int carga;
    private String color;
    public Lavadora(int precio, char consumo, String modelo, String marca, int carga, String color, int peso) {
        super(precio, consumo, modelo, marca, peso);
        this.carga = carga;
        this.color = color;
    }
    public Lavadora(){
        super();
        this.carga = 5;
        this.color = "Blanco"; //color generico porque no especifica
    }
    public String getLVDR(){
        String lvdr = "Tiene una carga de " + this.carga + " kg, y es de color " + this.color;
        return lvdr;
    }
}
