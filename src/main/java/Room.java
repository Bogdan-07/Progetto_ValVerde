import java.util.Hashtable;

public class Room {
    private String roomName;
    private Hashtable<String, Sensor> sensors;
    private Hashtable<String, Amenities> houseFeatures;

    // Constructor
    public Room(String roomName) {
        this.roomName = roomName;
        sensors = new Hashtable<>();
        houseFeatures = new Hashtable<>();
    }

    // Set & Get
    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomName() {
        return roomName;
    }

    // Sensors methods
    public void addSensor(String sensorName, Sensor sensor) {
        sensors.put(sensorName, sensor);
        Logger.writeLog("Added sensor '" + sensorName + "' to room: " + this.roomName + "\n");
    }

    public Sensor getSensor(String key) {
        return sensors.get(key);
    }

    public void removeSensor(String key) {
        sensors.remove(key);
        Logger.writeLog("Removed sensor '" + key + "' from room: " + this.roomName + "\n");
    }

    // Amenities methods
    public void addHouseFeature(Amenities device) {
        houseFeatures.put(device.getDeviceName(), device);
        Logger.writeLog("Added amenity '" + device.getDeviceName() + "' to room: " + this.roomName + "\n");
    }

    public Amenities getHouseFeature(String key) {
        return houseFeatures.get(key);
    }

    public void removeHouseFeature(String key) {
        houseFeatures.remove(key);
        Logger.writeLog("Removed amenity '" + key + "' from room: " + this.roomName + "\n");
    }
}