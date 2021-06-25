package Ej2_olde;

public enum EmergencyServices {
    POLICE("Policia", 911),
    FIRE("Bomberos", 100),
    HEALTH("Ambulancia", 107);
    private String nombre;
    private int numTel;
    EmergencyServices(String nombre, int numTel) {
        this.nombre = nombre;
        this.numTel = numTel;
    }
    @Override
    public String toString() {
        return String.format("Llamando a %s al %d", nombre, numTel);
    }
}
