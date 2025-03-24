package day10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Examplemap {

    public static void main(String[] args) {


        HashMap<String, String> name = new HashMap<>();
        name.put("Name", "Arvind");
        name.put("City", "Bangalore");
        name.put("Country", "India");

        System.out.println(name.get("Name"));


        for(Map.Entry<String, String> x : name.entrySet()){
            System.out.println(x.getKey() + " : " + x.getValue());
        }


    }
}
