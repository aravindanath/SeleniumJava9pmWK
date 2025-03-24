package day10;

import java.util.ArrayList;
import java.util.List;

public class ExampleList {

    public static void main(String[] args) {


        ArrayList<String> name = new ArrayList<>();
        name.add("Arvind");
        name.add("Raj");
        name.add("Ravi");
        name.add("Rajesh");
        name.add("Rajeev");


//        System.out.println(name.get(3));

        for(int i = 0; i<name.size();i++){
            System.out.println(name.get(i));
        }
    }
}
