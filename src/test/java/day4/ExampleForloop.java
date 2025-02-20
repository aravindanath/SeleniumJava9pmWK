package day4;

public class ExampleForloop {

    public static void main(String[] args) {
        String [] names = {"Vikas","Arvind","Rahul","Rohit"};

        /*
         for(DataType variableName : ArrayName){
            //Code
         }
         */

        System.out.println(names.length);

        for(int i=0;i<names.length;i++){
            System.out.println(names[i]);
        }


    }
}
