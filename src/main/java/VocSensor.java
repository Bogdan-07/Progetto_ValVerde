import java.util.*;

public class VocSensor extends Sensor{
    private boolean detectOrganicCompounds;
    private float airQuality;

    public VocSensor(String deviceName){
        super(deviceName);
        airQuality = (float)(Math.random() * 100) + 1;
    }

    //Setter & Getter

    public boolean isDetectOrganicCompounds() {
        return detectOrganicCompounds;
    }

    public float getAirQuality() {
        return airQuality;
    }

    public void setAirQuality(float airQuality) {
        this.airQuality = airQuality;
    }

    public void setOrganicCompunds(boolean detectOrganicCompounds){
        if(detectOrganicCompounds)
            airQuality = (float)(Math.random() * 100) + 1;
    }

    public String toString(){
        return "Air quality: " + airQuality;
    }
}