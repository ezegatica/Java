package Ej2_olde;

public class Sensor {
    private final String name;
    private final int id;
    private boolean activado = false;
    private CentralAlarmSystem central;

    public Sensor(int id, String name, CentralAlarmSystem central) {
        this.id = id;
        this.name = name;
        this.central = central;
    }

    public void motionDetected() {
        if (activado) {
            System.out.println(toString() + "  detectó movimiento");
            central.getEmergencyServices();
        }
    }

    @Override
    public String toString() {
        return String.format("Sensor  %s  (ID:  %d)", name, id);
    }

    public void activate() {
        System.out.println(String.format("Sensor %s (ID: %d) activado)", name, id));
        this.activado = true;
    }

    public void deactivate() {
        System.out.println(String.format("Sensor %s (ID: %d) desactivado)", name, id));
        this.activado = false;
    }
}
/*
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
*/