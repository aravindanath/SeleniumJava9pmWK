package day9;

public class ExceptionExample3 {

    public static void main(String[] args) {


        System.out.println("Starting the program");

         System.out.println("Starting");

        int y = 0; // Type casting
        int x = 0;
        try {
            String num = "tten";
            y = Integer.parseInt(num);
            x = 10;
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

        System.out.println(x+y);


        System.out.println("  Ending");
    }
}
