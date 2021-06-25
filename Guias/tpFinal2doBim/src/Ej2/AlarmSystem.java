package Ej2;
import java.util.Arrays;

public class AlarmSystem {
    private CentralAlarmSystem central;
    private String nombre;
    private int id = 0;
    private Sensor2[] sensores;
    public AlarmSystem(CentralAlarmSystem central, String nombre){
        this.central = central;
        this.nombre = nombre;
        this.sensores = new Sensor2[10];
    }

    public Sensor addAlarmSensor(String nombre){
        if(id == sensores.length){
            sensores = Arrays.copyOf(sensores, sensores.length + 10);
          }
        Sensor2 sensor = new Sensor2(id, nombre, central);
        sensores[id++] = sensor;
        return sensor;
    }

    public void activate(){
        System.out.println(String.format("Activando alarma de sensores de %s", nombre));
        for (Sensor2 sensor : sensores){
            if(sensor != null){
                sensor.activate();
            }
        }
    }

    public void deactivate(){
        System.out.println(String.format("Desctivando alarma de sensores de %s", nombre));
        for (Sensor2 sensor : sensores){
            if(sensor != null){
                sensor.deactivate();
            }
        }
    }
}