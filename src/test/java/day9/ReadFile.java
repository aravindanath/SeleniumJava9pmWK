package day9;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadFile {

    public static void main(String[] args) throws IOException {

        String path = System.getProperty("user.dir")+ File.separator+"Config.properties";

        FileInputStream fis = new FileInputStream(path);
        Properties properties = new Properties();
        properties.load(fis);
        String value =   properties.getProperty("url");
        System.out.println(value);



    }
}
