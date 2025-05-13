public class TempSensor extends Sensor{
    private float temp;

    // Constructor

    public TempSensor(String deviceName){
        super(deviceName);
        temp = (float)(Math.random() * 12+14);
    }

    // Get & Set

    public float getTemp() {
        return temp;
    }
    public void setTemp(float temp) {
        this.temp = temp;
    }

    // toString

    public String toString() {
        return "Temperature: " + temp;
    }
}