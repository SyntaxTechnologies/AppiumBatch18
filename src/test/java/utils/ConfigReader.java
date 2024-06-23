package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    static Properties prop;

    public static Properties readProperties(){
        try{
            prop = new Properties();
            FileInputStream fis = new FileInputStream("src\\test\\resources\\config\\config.properties");
            prop.load(fis);
        }catch(IOException e){
            e.getMessage();
        }
        return prop;
    }

    public static String getPropertyValue(String key){
        return prop.getProperty(key);
    }
}
