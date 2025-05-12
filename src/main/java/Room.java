import java.util.Hashtable;

public class Room {
    private String roomName;
    private Hashtable<String, Amenities> roomFeatures;  // Single Hashtable for all amenities

    // Constructor
    public Room(String roomName) {
        this.roomName = roomName;
        roomFeatures = new Hashtable<>();
    }

    // Set & Get
    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomName() {
        return roomName;
    }

    //Amenities

    public void addAmenity(String name, Amenities device) {
        roomFeatures.put(name, device);
        Logger.writeLog("Added amenity '" + name + "' to room: " + this.roomName + "\n");
    }
    public Amenities getAmenity(String key) {
        return roomFeatures.get(key);
    }
    public void removeRoomFeature(String key) {
        roomFeatures.remove(key);
        Logger.writeLog("Removed amenity '" + key + "' from room: " + this.roomName + "\n");
    }

    //Sensors

    public void addSensor(String sensorName, Sensor sensor) {
        addAmenity(sensorName, sensor);
    }
    public Sensor getSensor(String key) {
        Amenities item = getAmenity(key);
        return (item instanceof Sensor) ? (Sensor) item : null;
    }



    public Hashtable<String, Amenities> getRoomFeatures() {
        return roomFeatures;
    }

    public String toString() {
        return "Room{" +
                "roomName='" + roomName + '\'' +
                ", roomFeatures=" + roomFeatures +
                '}';
    }
}