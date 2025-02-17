package day2;


import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int x = sc.nextInt();
        System.out.print("Enter the second number: ");
        int y = sc.nextInt();
        Calculator cal =  new Calculator(); // object of class
        cal.addTwoNumbers(x,y);

    }

    // method
    // access-modifier return-type method-name(parameters)

    public void addTwoNumbers(int x, int y){
        int sum = x+y;
        System.out.println("Sum of two numbers: "+sum);
    }
    // method overloading

    public void addTwoNumbers(int x, int y,int z){
        int sum = x+y;
        System.out.println("Sum of two numbers: "+sum);
    }
}
