package day4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExampleSwitchCase {

    public static void main(String[] args) {

        String browser = "chrome";
        WebDriver driver =null;

        switch (browser) {
            case "chrome" :
                if (browser.equalsIgnoreCase("chrome")) {
                    driver = new ChromeDriver();
                }
                break;
            case "firefox" :
                System.out.println("Firefox Browser");
                if (browser.equalsIgnoreCase("firefox")) {
                    driver = new FirefoxDriver();
                }
                break;
            default:
                System.out.println("Invalid Browser");

        }
        driver.get("https://www.google.com");
    }

}
