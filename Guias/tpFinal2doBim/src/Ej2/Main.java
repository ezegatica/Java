package Ej2;

public class Main {

    public static void main(String[] args) {
        CentralAlarmSystem central = new CentralAlarmSystem(new EmergencyServices[]{EmergencyServices.POLICE, EmergencyServices.FIRE}); //####################
        AlarmSystem alarmSystem = new AlarmSystem(central, "Casa"); //Activando alarma de sensores de Casa
        Sensor doorSensor = alarmSystem.addAlarmSensor("Puerta"); //Sensor Puerta (ID: 0) activado
        Sensor windowSensor = alarmSystem.addAlarmSensor("Ventana"); //Sensor Ventana (ID: 1) activado
        System.out.println("##########"); //##########
        doorSensor.motionDetected();
        System.out.println("##########");
        alarmSystem.activate();
        System.out.println("##########");
        windowSensor.motionDetected(); //Sensor Ventana (ID: 1) detectó movimiento //Llamando a Policía al 911 //Llamando a Bomberos al 100
        System.out.println("##########");
        alarmSystem.deactivate(); //Desactivando alarma de sensores de Casa //Sensor Puerta (ID: 0) desactivado //Sensor Ventana (ID: 1) desactivado
        System.out.println("##########");
        doorSensor.motionDetected();
        System.out.println("##########");
        central.setEmergencyServices(
        new EmergencyServices[]{EmergencyServices.HEALTH});
        System.out.println("##########");
        alarmSystem.activate(); //Activando alarma de sensores de Casa //Sensor Puerta (ID: 0) activado //Sensor Ventana (ID: 1) activado
        System.out.println("##########");
        doorSensor.motionDetected(); //Sensor Puerta (ID: 0) detectó movimiento //Llamando a Ambulancia al 107
        System.out.println("##########");
        Sensor balconySensor = alarmSystem.addAlarmSensor("Balcón");
        balconySensor.motionDetected();//!!!!no se activa porque predeterminadamente estan apagados!!!!
        System.out.println("##########");
    }
}