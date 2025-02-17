
package day2;

public class ExampleIfConditions2 {

    public static void main(String[] args) {
        int age = 5;

        if(age>=18){
            System.out.println("You are eligible to vote");
        }else if(age<18) {
            System.out.println("You are not eligible to vote");

        }else {
            System.out.println("Invalid age");
        }
        System.out.println("End of conditions");
    }
}
