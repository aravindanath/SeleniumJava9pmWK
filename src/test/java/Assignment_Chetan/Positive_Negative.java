package Assignment_Chetan;

import java.util.Scanner;

public class Positive_Negative {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (num > 0) {
            System.out.println(num + " is a positive number.");
        }
        else if (num < 0) {
            System.out.println(num + " is a negative number.");
        }
        else {
            System.out.println(num + " is zero.");
        }
    }
}
