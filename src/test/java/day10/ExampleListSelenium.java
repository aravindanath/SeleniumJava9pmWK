package day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExampleListSelenium {

    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.get("https://www.wikipedia.org/");

        List<WebElement> lang = driver.findElements(By.xpath("//select[@id='searchLanguage']/option"));

        ArrayList<String> langList = new ArrayList<>();



        for(WebElement x : lang){
            langList.add(x.getText());
        }

        System.out.println("Before Sort "+ langList);
        Collections.sort(langList);

        System.out.println("After Sort "+ langList);
        driver.quit();


    }
}
