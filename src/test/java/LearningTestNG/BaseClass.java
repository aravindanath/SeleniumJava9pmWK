package LearningTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {


    protected WebDriver driver;


    @BeforeClass
    public void setup(){
        System.out.println("Before Class");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }


    @AfterClass
    public void close(){
        System.out.println("After Class");
        driver.quit();
    }
}
