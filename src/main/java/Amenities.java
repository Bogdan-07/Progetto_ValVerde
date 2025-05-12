public class Amenities {
    private String deviceName;
    private boolean status;

    public Amenities(String deviceName){
        this.deviceName = deviceName;
        status = false;
    }


    public String getDeviceName() {
        return deviceName;
    }
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public boolean isStatus() {
        return status;
    }
    public void turnOn(){
        status = true;
    }
    public void turnOff(){
        status = false;
    }

    public String toString() {
        return "deviceName: " + deviceName + "\n" +
                "status: " + status + "\n";
    }
}