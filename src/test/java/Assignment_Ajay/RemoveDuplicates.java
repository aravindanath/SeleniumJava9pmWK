package Assignment_Ajay;//Write a Java program to print after removing duplicates from a given string
//Sample Output:
//The given string is: w3resource
//After removing duplicates characters the new string is: w3resouc

import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        // Define the input string
        String inputString = "w3resource";

        // Call method to remove duplicates
        String resultString = removeDuplicates(inputString);

        // Print results
        System.out.println("The given string is: " + inputString);
        System.out.println("After removing duplicate characters the new string is: " + resultString);
    }

    // Method to remove duplicate characters
    public static String removeDuplicates(String str) {
        // Using LinkedHashSet to maintain order and remove duplicates
        LinkedHashSet<Character> charSet = new LinkedHashSet<>();

        // Add characters to the set
        for (char c : str.toCharArray()) {
            charSet.add(c);
        }

        // Build the result string
        StringBuilder result = new StringBuilder();
        for (char c : charSet) {
            result.append(c);
        }

        return result.toString();
    }
}

