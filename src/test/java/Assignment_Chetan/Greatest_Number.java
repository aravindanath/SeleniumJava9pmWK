package Assignment_Chetan;

import java.util.Scanner;

public class Greatest_Number {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        System.out.print("The greatest number is " + greatestNumber(num1, num2, num3));
    }

    public static int greatestNumber(int num1, int num2, int num3) {
        return Math.max(Math.max(num1, num2), num3);
    }
}
