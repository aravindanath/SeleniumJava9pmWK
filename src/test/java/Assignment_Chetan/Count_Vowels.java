package Assignment_Chetan;

import java.util.Scanner;

public class Count_Vowels {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter the String: ");
        String str = scanner.nextLine();
        System.out.print("Number of Vowels in the given String: " + countVowels(str));
    }

    public static int countVowels(String str) {

        int count = 0;
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }
}
