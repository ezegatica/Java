package Ej2;

public class Sensor2 extends Sensor{
    private CentralAlarmSystem central;
    private boolean activado = false;
    public Sensor2(int id, String nombre, CentralAlarmSystem central){
        super(id, nombre);
        this.central = central;
    }
    @Override
    public void motionDetected(){
        if (activado) {
            System.out.println(super.toString() + "  detectó movimiento");
            EmergencyServices[] em = central.getEmergencyServices();
            for (EmergencyServices servicio : em){
                System.out.println(servicio);
            }
        }
    }
    public void activate() {
        this.activado = true;
        System.out.println(String.format("%s activado)", this.toString()));
    }

    public void deactivate() {
        this.activado = false;
        System.out.println(String.format("%s desactivado)", this.toString()));
    }
    
}
