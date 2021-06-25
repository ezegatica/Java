package Ej2;
import java.util.Arrays;

public class AlarmSystem {
    private CentralAlarmSystem central;
    private String nombre;
    private int id = 0;
    private Sensor[] sensores;
    public AlarmSystem(CentralAlarmSystem central, String nombre){
        this.central = central;
        this.nombre = nombre;
        this.sensores = new Sensor[10];
    }

    public Sensor addAlarmSensor(String nombre){
        if(id == sensores.length){
            sensores = Arrays.copyOf(sensores, sensores.length + 10);
          }
        Sensor sensor = new Sensor(id, nombre);
        sensores[id++] = sensor;
        return sensor;
    }

    public void activate(){
        System.out.println(String.format("Activando alarma de sensores de %s", nombre));
        for (Sensor sensor : sensores){
            if(sensor != null){
                System.out.println(String.format("%s activado)", sensor));
            }
        }
    }

    public void deactivate(){
        System.out.println(String.format("Desctivando alarma de sensores de %s", nombre));
        for (Sensor sensor : sensores){
            if(sensor != null){
                System.out.println(String.format("%s desactivado)", sensor));
            }
        }
    }
    public void llamarServicios(){
        EmergencyServices[] servicios = central.getEmergencyServices();
        for (EmergencyServices servicio : servicios){
            System.out.println(servicio);
        }
    }
}