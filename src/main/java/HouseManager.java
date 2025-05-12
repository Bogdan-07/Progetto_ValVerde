import java.util.Hashtable;

public class HouseManager {
     final Hashtable<String, Room> roomManager;
     final Hashtable<String, Pool> poolManager;

    // Constructor
    public HouseManager() {
        roomManager = new Hashtable<>();
        poolManager = new Hashtable<>();
    }

    // Rooms methods
    public void addRoom(Room inputRoom) {
        roomManager.put(inputRoom.getRoomName(), inputRoom);
        Logger.writeLog("Added room: " + inputRoom.getRoomName() + "\n");
    }

    public Room getRoom(String key) {
        if (roomManager.isEmpty() || !roomManager.containsKey(key))
            return null;
        else
            return roomManager.get(key);
    }

    public int removeRoom(String key) {
        if (roomManager.isEmpty()) {
            return -1;
        } else {
            roomManager.remove(key);
            Logger.writeLog("Removed room: " + key + "\n");
            return 0;
        }
    }

    // Pools methods
    public void addPool(Pool inputPool) {
        poolManager.put(inputPool.getPoolName(), inputPool);
        Logger.writeLog("Added pool: " + inputPool.getPoolName() + "\n");
    }

    public Pool getPool(String key) {
        if (poolManager.isEmpty() || !roomManager.containsKey(key))
            return null;
        else
            return poolManager.get(key);
    }

    public int removePool(String key) {
        if (poolManager.isEmpty()) {
            return -1;
        } else {
            poolManager.remove(key);
            Logger.writeLog("Removed pool: " + key + "\n");
            return 0;
        }
    }

    //general Getters

    public Hashtable<String, Room> getRoomManager() {
        return roomManager;
    }

    public Hashtable<String, Pool> getPoolManager() {
        return poolManager;
    }

    // toString

    public String toString() {
        return "roomManager: " + roomManager +
                "poolManager: " + poolManager;
    }
}