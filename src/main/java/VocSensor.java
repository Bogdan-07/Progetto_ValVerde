public class VocSensor extends Sensor{
    private float airQuality;

    // Constructor

    public VocSensor(String deviceName){
        super(deviceName);
        airQuality = (float)(Math.random() * 100) + 1;
    }

    // toString

    public String toString(){
        return "Air quality: " + airQuality;
    }
}