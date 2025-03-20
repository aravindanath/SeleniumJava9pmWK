package day10;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;

public class ExampleArrays2 {

    public static void main(String[] args) {

        String name [] = {"Arvind", "Raj", "Ravi", "Rajesh", "Rajeev","Arvind", "Raj", "Ravi", "Rajesh", "Rajeev"};


        Arrays.sort(name);


        for(String nm : name){
            System.out.println(nm);
        }


    }

}
