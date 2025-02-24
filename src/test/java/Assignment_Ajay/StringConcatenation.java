package Assignment_Ajay;// Write a Java program to concatenate a given string to the end of another string
//Sample Output:
//String 1: PHP Exercises and
//String 2: Python Exercises
//The concatenated string: PHP Exercises and Python Exercises

public class StringConcatenation {
    public static void main(String[] args) {
        // Define the strings
        String str1 = "PHP Exercises and";
        String str2 = "Python Exercises";

        // Concatenate the strings
        String concatenatedString = str1 + " " + str2;

        // Print the result
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        System.out.println("The concatenated string: " + concatenatedString);
    }
}

