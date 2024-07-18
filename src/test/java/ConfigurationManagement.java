
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class ConfigurationManagement {
    public static void main (String[] args) throws IOException {


        Properties prop = new Properties();
        String fileName = "config.properties";

        try (InputStream input = new FileInputStream(fileName)) {
           
            prop.load(input);

            String text = prop.getProperty("text");
            System.out.printf(text);

    }


} }
