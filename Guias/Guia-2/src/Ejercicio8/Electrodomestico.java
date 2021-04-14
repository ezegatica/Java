package Ejercicio8;

public class Electrodomestico {
    private int precio;
    private char consumo;
    private String modelo;
    private String marca;
    private int peso;
    public Electrodomestico() {
        this.precio = 100;
        this.consumo = 'F';
        this.marca = "PHILIPS";
        this.modelo = "J45";
        this.peso = 5;
    }
    public Electrodomestico(int precio, char consumo, String modelo, String marca, int peso){
        this.precio = precio;
        // this.consumo = consumo;
        this.consumo = comprobarConsumoEnergetico(consumo);
        this.modelo = modelo;
        this.marca = marca;
        this.peso = peso;
    }
    public char comprobarConsumoEnergetico(char letra){
        if ("ABCDEFabcdef".indexOf(letra) != -1){
            return letra;
        }else{
            return 'F';
        }
    }
    public String get(){
        String x = this.marca + " " + this.modelo + ", con consumo " + this.consumo + ", un precio de: $" + this.precio + " y un peso de " + this.peso + " kilos. ";
        return x;
    }

}
