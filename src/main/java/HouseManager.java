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

    public void addRoom(String roomName,Room inputRoom) {
        roomName = roomName.toLowerCase();
        roomManager.put(roomName, inputRoom);
        Logger.writeLog("Added room: " + inputRoom.getRoomName() + "\n");
    }
    public Room getRoom(String key) {
        key = key.toLowerCase();
        if (roomManager.isEmpty() || !roomManager.containsKey(key))
            return null;
        else
            return roomManager.get(key);
    }
    public int removeRoom(String key) {
        key = key.toLowerCase();
        if (roomManager.isEmpty() || !roomManager.containsKey(key)) {
            Logger.writeLog("Couldn't remove room: " + key + "\n");
            return -1;
        } else {
            roomManager.remove(key);
            Logger.writeLog("Removed room: " + key + "\n");
            return 0;
        }
    }

    // Pools methods

    public void addPool(String poolName,Pool inputPool) {
        poolName = poolName.toLowerCase();
        poolManager.put(poolName, inputPool);
        Logger.writeLog("Added pool: " + inputPool.getPoolName() + "\n");
    }
    public Pool getPool(String key) {
        key = key.toLowerCase();
        if (poolManager.isEmpty() || !poolManager.containsKey(key))
            return null;
        else
            return poolManager.get(key);
    }
    public int removePool(String key) {
        key = key.toLowerCase();
        if (poolManager.isEmpty() || !poolManager.containsKey(key)) {
            Logger.writeLog("Couldn't remove pool: " + key + "\n");
            return -1;
        } else {
            poolManager.remove(key);
            Logger.writeLog("Removed pool: " + key + "\n");
            return 0;
        }
    }

    // Get

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