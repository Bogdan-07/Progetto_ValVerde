import java.util.*;

public class TempSensor extends Sensor{
    private float temp;

    public TempSensor(String deviceName){
        super(deviceName);
        temp = (float)(Math.random() * 12+14);
    }

    //Getter & Setter

    public float getTemp() {
        return temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }

    //toString

    public String toString() {
        return "Temperature: " + temp;
    }
}