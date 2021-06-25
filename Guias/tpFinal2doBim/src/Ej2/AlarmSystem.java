package Ej2;

public class AlarmSystem {
    private CentralAlarmSystem central;
    private String nombre;
    private int id = 0;
    public AlarmSystem(CentralAlarmSystem central, String nombre){
        this.central = central;
        this.nombre = nombre;
    }

    public Sensor addAlarmSensor(String nombre){
        Sensor sensor = new Sensor(id, nombre);
        id++;
        return sensor;
    }

    public void activate(){
        System.out.println(String.format("Activando alarma de sensores de %s", nombre));
    }

    public void deactivate(){
        System.out.println(String.format("Desctivando alarma de sensores de %s", nombre));
    }
}