package Enum_1;

public enum Toppings {
    QUESO("Extra queso", 20),
    TOMATE("Tomate", 30),
    CEBOLLA("Cebolla", 10);
    private String nameT;
    private int priceT;
    Toppings(String nameT, int priceT){
        this.nameT = nameT;
        this.priceT = priceT;
    } 
}


