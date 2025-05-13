import java.util.Hashtable;

public class Room {
    private String roomName;
    private Hashtable<String, Amenities> roomFeatures;

    // Constructor
    public Room(String roomName) {
        roomName = roomName.toLowerCase();
        this.roomName = roomName;
        roomFeatures = new Hashtable<>();
    }

    // Get

    public String getRoomName() {
        return roomName;
    }

    //Amenities

    public void addAmenity(String name, Amenities device) {
        name = name.toLowerCase();
        roomFeatures.put(name, device);
        Logger.writeLog("Added amenity '" + name + "' to room: " + this.roomName + "\n");
    }
    public Amenities getAmenity(String key) {
        key = key.toLowerCase();
        return roomFeatures.get(key);
    }
    public int removeRoomFeature(String key) {
        key = key.toLowerCase();
        if(roomFeatures.isEmpty() || !roomFeatures.contains(key)) {
            Logger.writeLog("Amenity not found in room: "+ this.roomName + "\n");
            return -1;
        } else {
            roomFeatures.remove(key);
            Logger.writeLog("Removed amenity '" + key + "' from room: " + this.roomName + "\n");
            return 0;
        }
    }

    // Get roomFeatures

    public Hashtable<String, Amenities> getRoomFeatures() {
        return roomFeatures;
    }

    // toString

    public String toString() {
        return "Room{" +
                "roomName='" + roomName + '\'' +
                ", roomFeatures=" + roomFeatures +
                '}';
    }
}