import java.io.FileWriter;
import java.time.LocalDate;

public class Logger {

    // Logger method

    public static void writeLog(String input){
        String time = LocalDate.now().toString();
        try{
            FileWriter fileWriter = new FileWriter("log_" + LocalDate.now() + ".txt", true);
            fileWriter.write(time + " " + input);
            fileWriter.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
