package day10;

public class ExampleArrays {

    public static void main(String[] args) {

        String name [] = {"Arvind", "Raj", "Ravi", "Rajesh", "Rajeev"};


        String city [] = new String[6];
        city[0] = "Bangalore";
        city[1] = "Chennai";
        city[2] = "Mumbai";
        city[3] = "Delhi";
        city[4] = "Kolkata";
        city[5] = "dehadun";

        System.out.println(name.length);

        for(int i=0;i<=name.length;i++){
            System.out.println(city[i]);
        }


    }

}
