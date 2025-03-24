package day10;

import java.util.ArrayList;
import java.util.Collections;

public class ExampleList2 {

    public static void main(String[] args) {


        ArrayList<String> name = new ArrayList<>();
        name.add("Arvind");
        name.add("Raj");
        name.add("Ravi");
        name.add("Rajesh");
        name.add("Rajeev");
        name.add("Aadvik");


        Collections.sort(name);
//        System.out.println(name.get(3));


        for(String x : name){
            System.out.println(x);
        }

    }
}
