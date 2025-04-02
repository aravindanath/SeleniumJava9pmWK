package Assignment_Chetan;

import java.util.Scanner;

public class Count_Words {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter the String: ");
        String str = scanner.nextLine();
        System.out.print("Number of words in the given String: " + countWords(str));
    }

    public static int countWords(String str) {

        int count = 0;
        if(!(" ".equals(str.substring(0, 1))) || !(" ".equals(str.substring(str.length() -1)))) {

            for(int i = 0; i < str.length(); i++) {

                if(str.charAt(i) == ' ') {
                    count++;
                }
            }
            count = count + 1;
        }
        return count;
    }
}
