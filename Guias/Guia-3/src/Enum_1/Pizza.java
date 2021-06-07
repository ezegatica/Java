package Enum_1;

public class Pizza {
    private int precio;
    private Coccion coccion;
    private Toppings ingredientes[];
    public Pizza(Coccion coccion, Toppings[] ingredientes){
        
    }
    @Override
    public String toString(){
        int finalPrice;
        StringBuilder str;
        str = new StringBuilder();
        str.append("Pizza ");
        str.append(coccion.getNameP());
        finalPrice = coccion.getPriceP();
        // for (int i = 0; i < ingredientes; i++){}
        str.append(": $").append(finalPrice);
        return str.toString();
    }

}
