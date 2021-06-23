package Ej2;

public class Sensor {
    private final String name;
    private final int id;

    public Sensor(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void motionDetected() {
        System.out.println(toString() + "  detectó movimiento");
    }

    @Override
    public String toString() {
        return String.format("Sensor  %s  (ID:  %d)", name, id);
    }
}
