import java.io.FileWriter;
import com.google.gson.*;
import java.util.Hashtable;

public class ToJson {
    private Gson gson;

    // Constructor

    public ToJson(){
        gson = new Gson();
    }

    // ConvertToJson

    public void roomToJson(Hashtable<String, Room> roomManager){
        saveJson(gson.toJson(roomManager));
    }
    public void poolToJson(Hashtable<String, Pool> poolManager){
        saveJson(gson.toJson(poolManager));
    }

    // WriteInJsonFile

    private void saveJson(String input){
        try{
            FileWriter writer = new FileWriter("Houseinformation.json");
            writer.write(input);
            writer.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    // ConvertFromJson

    /*public Room jsonToRoom(){
        String json = "{\"key\": \"value\"}";
        Hashtable<String, Room> roomManager = new Hashtable<>();
        return gson.fromJson();
    }*/
}
