package Ej2_olde;

public class CentralAlarmSystem {
    private EmergencyServices[] emergencyServices;

    public CentralAlarmSystem(EmergencyServices[] emergencyServices) {
        setEmergencyServices(emergencyServices);
    }

    public void getEmergencyServices() {
        for (EmergencyServices servicio : emergencyServices){
            System.out.println(servicio);
        }
    }

    public void setEmergencyServices(EmergencyServices[] emergencyServices) {
        this.emergencyServices = emergencyServices;
    }
}
