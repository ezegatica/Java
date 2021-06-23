package Ej2;

public class CentralAlarmSystem {
    private EmergencyServices[] emergencyServices;

    public CentralAlarmSystem(EmergencyServices[] emergencyServices) {
        setEmergencyServices(emergencyServices);
    }

    public EmergencyServices[] getEmergencyServices() {
        return emergencyServices;
    }

    public void setEmergencyServices(EmergencyServices[] emergencyServices) {
        this.emergencyServices = emergencyServices;
    }
}
