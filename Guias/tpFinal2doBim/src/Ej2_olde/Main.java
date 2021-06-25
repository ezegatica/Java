package Ej2_olde;

public class Main {
    // Se desea crear un conjunto de clases que modelan un sistema de alarmas. 
    //Cada sistema de alarmas estará compuesto por uno o más sensores que detectan
    // movimiento. El sistema de alarmas contará con métodos para agregar un nuevo
    // sensor y para activar y desactivar el sistema de alarmas. Activar el sistema
    // de alarmas implica activar todos los sensores del mismo. Desactivar el
    // sistema de alarmas implica desactivar todos los sensores del mismo. Si el
    // sensor está activo y detecta movimiento, entonces el sistema de alarmas
    // llamará a los servicios de emergencia correspondientes. Ya cuenta con la
    // clase Sensor que modela un sensor de movimiento.
    public static void main(String[] args) {
        CentralAlarmSystem central = new CentralAlarmSystem(new EmergencyServices[] { EmergencyServices.POLICE, EmergencyServices.FIRE });
        AlarmSystem alarmSystem = new AlarmSystem(central, "Casa"); 
        Sensor doorSensor = alarmSystem.addAlarmSensor("Puerta"); 
        Sensor windowSensor = alarmSystem.addAlarmSensor("Ventana"); 
        System.out.println("##########"); // ##########
        doorSensor.motionDetected();
        System.out.println("##########");
        alarmSystem.activate(); // Activando alarma de sensores de Casa // Sensor Puerta (ID: 0) activado// Sensor Ventana (ID: 1) activado
        System.out.println("##########");
        windowSensor.motionDetected(); // Sensor Ventana (ID: 1) detectó movimiento //Llamando a Policía al 911
                                       // //Llamando a Bomberos al 100
        System.out.println("##########");// ##########
        alarmSystem.deactivate(); // Desactivando alarma de sensores de Casa //Sensor Puerta (ID: 0) desactivado
                                  // //Sensor Ventana (ID: 1) desactivado
        System.out.println("##########"); //##########
        doorSensor.motionDetected();
        System.out.println("##########");//##########
        central.setEmergencyServices(new EmergencyServices[] { EmergencyServices.HEALTH });
        System.out.println("##########");//##########
        alarmSystem.activate(); // Activando alarma de sensores de Casa //Sensor Puerta (ID: 0) activado
                                // //Sensor Ventana (ID: 1) activado
        System.out.println("##########");//##########
        doorSensor.motionDetected(); // Sensor Puerta (ID: 0) detectó movimiento //Llamando a Ambulancia al 107
        System.out.println("##########");//##########
        Sensor balconySensor = alarmSystem.addAlarmSensor("Balcón");
        balconySensor.motionDetected();// !!!!no se activa porque predeterminadamente estan apagados!!!!
        System.out.println("##########");//##########
    }
}

/*
##########
########## 
Activando  alarma  de  sensores  de  Casa 
Sensor  Puerta  (ID:  0)  activado 
Sensor  Ventana  (ID:  1)  activado 
########## 
Sensor  Ventana  (ID:  1)  detectó  movimiento 
Llamando  a  Policía  al  911 
Llamando  a  Bomberos al  100 
########## 
Desactivando  alarma  de  sensores  de  Casa 
Sensor  Puerta  (ID:  0)  desactivado 
Sensor  Ventana  (ID:  1)  desactivado 
########## 
########## 
########## 
Activando  alarma  de  sensores  de  Casa 
Sensor  Puerta  (ID:  0)  activado 
Sensor  Ventana  (ID:  1)  activado 
########## 
Sensor  Puerta  (ID:  0)  detectó  movimiento 
Llamando  a  Ambulancia  al  107 
########## 
##########
*/