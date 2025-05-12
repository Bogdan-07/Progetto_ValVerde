import java.util.*;

public class HumiditySensor extends Sensor{
    private float humidity;

    public HumiditySensor(){
        humidity = (float)(Math.random() * 100) + 1;
    }

    public float getHumidity(){
        return humidity;
    }

    public void increaseTempGradually() {
        for (float i = humidity; i < 75; i++) {
            humidity += 0.5f;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }  
    
    public void decreaseTempGradually() {
        for (float i = humidity; i > 16; i++) {
            humidity -= 0.5f;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public String toString(){
        return "Humidity: " + humidity;
    }
}