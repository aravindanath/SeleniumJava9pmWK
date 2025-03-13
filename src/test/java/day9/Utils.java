package day9;

import com.github.javafaker.Faker;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.Properties;

public class Utils {


    public static String getValue(String key){
        String path = System.getProperty("user.dir")+ File.separator+"Config.properties";

        Properties properties = null;
        String value;
        try {
            FileInputStream fis = new FileInputStream(path);
            properties = new Properties();
            properties.load(fis);
             value =   properties.getProperty(key);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return value;
    }


    public static void setValue(String key,String value){
        String path = System.getProperty("user.dir")+ File.separator+"New.properties";

        Properties properties = null;

        try {
            FileOutputStream fos = new FileOutputStream(path);
            properties = new Properties();
            properties.setProperty(key,value);
            properties.store(fos,"");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static String firstName(){
        Faker faker = new Faker(new Locale("en-IND"));
       return faker.name().firstName();
    }

    public static String fullName(){
        Faker faker = new Faker(new Locale("en-IND"));
        return faker.name().fullName();
    }

    public static String mobile(){
        Faker faker = new Faker(new Locale("en-IND"));
        return faker.number().digits(10);
    }

    public static String email(){
        Faker faker = new Faker(new Locale("en-IND"));
        return faker.name().firstName()+"@testmail.com";
    }

    public static String ramdomValue(){
        Faker faker = new Faker(new Locale("en-IND"));
        return faker.lorem().characters(30);
    }
    public static String ramdomSentence(){
        Faker faker = new Faker(new Locale("ja"));
        return faker.lorem().sentence(10);
    }




}
