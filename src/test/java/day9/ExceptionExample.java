package day9;

public class ExceptionExample {

    public static void main(String[] args) {


        System.out.println("Starting the program");

        int result = 0;
        try {
            int a = 10;
            int b = 2;

            result = a/b;
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Result: "+result);

        System.out.println("Ending the program");
    }
}
