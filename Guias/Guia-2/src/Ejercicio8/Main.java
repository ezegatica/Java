package Ejercicio8;

// Una compañía de electrodomésticos los contrata para diseñar una app.
// Necesitan una clase de televisor en donde se pueda pueda guardar el
// precio, consumo energético (letras entre A y F), marca, sus atributos son
// resolución (en pulgadas), sintonizador TDT (booleano) y modelo.
// Por defecto, la resolución será de 20 pulgadas, el sintonizador será false, el
// consumo energético será F, el precio es de $100, el peso de 5 kg, la marca
// philips y el modelo j45.
// Los métodos que implementara serán:
// comprobarConsumoEnergetico(char letra): comprueba que la letra es
// correcta, sino es correcta usará la letra por defecto. Se invocará al crear el
// objeto y no será visible.
// Luego queremos otra clase llamada Lavadora con las siguientes
// características:
// Sus atributos son carga, precio, color, consumo energético (letras entre A y
// F), marca y modelo.
// Por defecto, la carga es de 5 kg, el consumo energético será F, el precio es
// de $100, el peso de 5 kg, la marca philips y el modelo j45.
// También tiene que poder validar el consumo.
// Creen un programa de prueba para probar sus funcionalidades

public class Main {
    public static void main(String[] args) {
        // Televisor tv = new Televisor(100, 'G', "J45", "philips", 20, false, 5);
        Televisor tv = new Televisor();
        // Lavadora lvdr = new Lavadora(100, 'A', "J45", "philips", 20, "rojo", 5);
        Lavadora lvdr = new Lavadora();
        System.out.println("TV: " + tv.get() + tv.getTV());
        System.out.println("LAVADORA: " + lvdr.get() + lvdr.getLVDR());
    }
}
