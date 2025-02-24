package day4;

public class ExampleForEachloop {

    public static void main(String[] args) {
        String [] names = {"Vikas","Arvind","Rahul","Rohit"};

        /*
         for(DataType variableName : ArrayName){
            //Code
         }
         */

        for(String var : names){
            if(var.equals("Rahul")){
                System.out.println("Rahul is present");
            }else{
                System.out.println("Rahul is not present");
            }
        }
    }
}
