import java.util.*;

public class VocSensor extends Sensor{
    private boolean detectOrganicCompounds;
    private float airQuality;

    public VocSensor(){
        super();
    }

    public void setOrganicCompunds(boolean detectOrganicCompounds){
        if(detectOrganicCompounds)
            airQuality = (float)(Math.random() * 100) + 1;
    }

    public String toString(){
        return "Air quality: " + airQuality;
    }
}