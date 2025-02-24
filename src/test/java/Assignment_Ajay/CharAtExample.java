package Assignment_Ajay;//Write a Java program to get the character at the given index within the String- Sample Output:
//Sample Output:
//Original String = Java Exercises!
//The character at position 0 is J
//The character at position 10 is i

public class CharAtExample {
    public static void main(String[] args) {
        // Define the original string
        String str = "Java Exercises!";

        // Display the original string
        System.out.println("Original String = " + str);

        // Get and display characters at specified positions
        System.out.println("The character at position 0 is " + str.charAt(0));
        System.out.println("The character at position 10 is " + str.charAt(10));
    }
}