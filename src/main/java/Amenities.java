public class Amenities {
    private String deviceName;
    private boolean status;

    //Constructor

    public Amenities(String deviceName){
        this.deviceName = deviceName;
        status = false;
    }

    // Get & Set

    public String getDeviceName() {
        return deviceName;
    }
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    // Get & Set

    public boolean isStatus() {
        return status;
    }
    public void turnOn(){
        status = true;
    }
    public void turnOff(){
        status = false;
    }

    // toString

    public String toString() {
        return "deviceName: " + deviceName + "\n" +
                "status: " + status + "\n";
    }
}