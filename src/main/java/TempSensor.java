import java.util.*;

public class TempSensor extends Sensor{
    private float temp;

    public TempSensor(){
        temp = (float)(Math.random() * 12+14);
    }

    public float getTemp() {
        return temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }

    public String toString(){
        return "Temperature: " + temp;
    }
}