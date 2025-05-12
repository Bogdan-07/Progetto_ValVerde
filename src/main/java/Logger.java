import java.io.FileWriter;
import java.time.LocalDate;

public class Logger {

    public static void writeLog(String input){
        String time = LocalDate.now().toString();
        try{
            FileWriter fileWriter = new FileWriter("log.txt", true);
            fileWriter.write(time + " " + input);
            fileWriter.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
