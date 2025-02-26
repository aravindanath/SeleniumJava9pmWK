package day6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example {

    public static void main(String[] args) {

        RBI  rbi ;

        rbi = new SBI();

        System.out.println("SBI Int: "+rbi.interestRate());

        rbi = new AXIS();

        System.out.println("AXIS Int: "+rbi.interestRate());

        WebDriver driver = new ChromeDriver(); // Example of polymorphism

    }
}
