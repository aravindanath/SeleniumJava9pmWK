package Assignment_Chetan;

import java.util.Scanner;
public class Sum_Avg {

    public static void main(String[] args) {

        int n=0, sum=0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        n = scanner.nextInt();

        System.out.println("Enter the elements:");
        for (int i=0; i<n; i++)
        {
            int num = scanner.nextInt();
            sum += num;
        }
        double avg = sum/n;
        System.out.println("Sum: " + sum + " avg: " + avg);
    }
}
