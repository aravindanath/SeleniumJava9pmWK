package day9;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLaunch {

    public static void main(String[] args) {

        String browser = Utils.getValue("browser"),url = Utils.getValue("url");
        WebDriver driver = null;
        if (browser.equalsIgnoreCase("chrome")){
             driver = new ChromeDriver();
        }else if(browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        }
        driver.get(url);
    }
}
