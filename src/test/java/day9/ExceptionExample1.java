package day9;

public class ExceptionExample1 {

    public static void main(String[] args) {


        System.out.println("Starting the program");

        int result = 0;
        try {
            int a = 10;
            int b = 2;

            result = a/b;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (NullPointerException n){
            n.printStackTrace();
        }

        System.out.println("Result: "+result);

        System.out.println("Ending the program");
    }
}
