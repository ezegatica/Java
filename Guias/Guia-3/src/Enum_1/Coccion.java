package Enum_1;

public enum Coccion {
    PIEDRA("al horno", 100),
    HORNO("a la parrilla", 150);
    private String nameP;
    private int priceP;
    Coccion(String coccion, int precio){
        this.nameP = coccion;
        this.priceP = precio;
    } 
    public int getPriceP(){
        return priceP;
    }
    public String getNameP(){
        return nameP;
    }
}
