import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    static Properties properties ;


    static {
        String file= "config.properties";

        try {
            FileInputStream fis = new FileInputStream(file);
            properties= new Properties();
            properties.load(fis);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static String getProperty(String key){


        return properties.getProperty(key);
    }
}
