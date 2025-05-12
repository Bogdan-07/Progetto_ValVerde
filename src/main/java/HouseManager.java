import java.util.Hashtable;

public class HouseManager{
    private final Hashtable<String,Room> roomManager;
    private final Hashtable<String,Pool> poolManager;

    //Constructor

    public HouseManager(){
        roomManager = new Hashtable<>();
        poolManager = new Hashtable<>();
    }

    //Rooms methods

    public void addRoom(Room inputRoom){
        roomManager.put(inputRoom.getRoomName(), inputRoom);
    }
    public Room getRoom(String key){
        return roomManager.get(key);
    }
    public void removeRoom(String key){
        roomManager.remove(key);
    }

    //Pools methods

    public void addPool(Pool inputPool){
        poolManager.put(inputPool.getPoolName(), inputPool);
    }
    public Pool getPool(String key){
        return poolManager.get(key);
    }
    public void removePool(String key){
        poolManager.remove(key);
    }


    public String toString(){
        return roomManager.toString() + poolManager.toString();
    }

}