import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Logger {


    private static final String logfile = "application.log";

    public static void log(String message) {
        try (PrintWriter out = new PrintWriter(new FileWriter(logfile, true))) {
            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            out.println(now.format(formatter) + " - " + message);
        } catch (IOException e) {
            System.err.println("Logging error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        Logger.log("Application started");
        Logger.log("Performing some operations...");

        try {

            int result = 10 / 2;
            Logger.log("Operation successful, result: " + result);
        } catch (Exception e) {
            Logger.log("An error occurred: " + e.getMessage());
        }

        Logger.log("Application ended");
    }
}
