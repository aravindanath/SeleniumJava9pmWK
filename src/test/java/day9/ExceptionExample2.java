package day9;

public class ExceptionExample2 {

    public static void main(String[] args) {


        System.out.println("Starting the program");

         System.out.println("Starting");

        try {
            String name = null;

            System.out.println(name.length());
        } catch (NullPointerException e) {
             e.printStackTrace();
        }

        System.out.println("  Ending");
    }
}
