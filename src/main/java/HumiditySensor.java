public class HumiditySensor extends Sensor{
    private float humidity;

    // Constructor

    public HumiditySensor(String deviceName){
        super(deviceName);
        humidity = (float)(Math.random() * 100) + 1;
    }

    // Get

    public float getHumidity(){
        return humidity;
    }

    // toString

    public String toString(){
        return "Humidity: " + humidity;
    }
}