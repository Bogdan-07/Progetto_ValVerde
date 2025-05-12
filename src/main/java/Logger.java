
import java.io.FileWriter;

public class Logger {

    public static void writeLog(String input){
        try{
            FileWriter fileWriter = new FileWriter("log.txt", true);
            fileWriter.write(input);
            fileWriter.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
