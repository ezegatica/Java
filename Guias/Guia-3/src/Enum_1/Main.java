package Enum_1;

public class Main {
    public static void main(String[] args) {
    // Pizza a la parrilla con Tomate
        Pizza pizza1 = new Pizza(Coccion.HORNO, new Toppings[]{Toppings.TOMATE});
    // Pizza a la parrilla con Tomate con Cebolla con Extra queso
        // Pizza pizza2 = new Pizza();
    // Pizza al horno con Cebolla con Extra queso
        // Pizza pizza3 = new Pizza();
        System.out.println(pizza1);
        // System.out.println(pizza2);
        // System.out.println(pizza3);
     }
}
// Pizza a la parrilla con Tomate: $180.00
// Pizza a la parrilla con Tomate con Cebolla con Extra queso: $210.00
// Pizza al horno con Cebolla con Extra queso: $130.00
