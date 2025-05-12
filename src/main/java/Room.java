import java.util.Hashtable;

public class Room{
    private String roomName;
    private Hashtable<String,Sensor> sensors = new Hashtable<>();
    private Hashtable<String,Amenities> houseFeatures = new Hashtable<>();

    //Constructor

    public Room() {

    }

    //Set & Get

    public void setRoomName(String roomName){
        this.roomName = roomName;
    }
    public String getRoomName(){
        return roomName;
    }

    //Sensors methods

    public void addSensor(String sensorName,Sensor sensor){
        sensors.put(sensorName,sensor);
    }
    public Sensor getSensor(String key){
        return sensors.get(key);
    }
    public void removeSensor(String key){
        sensors.remove(key);
    }

    //Amenities methods

    public void addHouseFeature(Amenities device){
        houseFeatures.put(device.getDeviceName(),device);
    }
    public Amenities getHouseFeature(String key){
        return houseFeatures.get(key);
    }
    public void removeHouseFeature(String key){
        houseFeatures.remove(key);
    }
}