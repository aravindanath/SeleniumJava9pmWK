package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExampleSelenium {

    public static void main(String[] args) {

        String browser = "firefox";
        WebDriver driver = null;
        if(browser.equals("chrome")) {
              driver = new ChromeDriver();
        }else if(browser.equals("firefox")) {
              driver = new FirefoxDriver();
        }else {
           System.out.println("Invalid browser");
        }
        driver.get("https://www.google.com");
    }
}
