package day10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ExampleSet {

    public static void main(String[] args) {


        Set<String> name = new HashSet<>();
        name.add("Arvind");
        name.add("Raj");
        name.add("Ravi");
        name.add("Rajesh");
        name.add("Rajeev");
        name.add("Rajeev");



        for(String x : name){
            System.out.println(x);
        }
    }
}
