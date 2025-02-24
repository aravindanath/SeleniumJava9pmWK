package Assignment_Ajay;// Write a Java program to test if a given string contains the specified sequence of char values
// Sample Output:
// Comparing example.com and example.com: true
// Comparing Example.com and example.com: false

public class StringComparison {
    public static void main(String[] args) {
        // Sample strings
        String str1 = "example.com";
        String str2 = "example.com";
        String str3 = "Example.com";

        // Comparing strings using contains
        System.out.println("Comparing " + str1 + " and " + str2 + ": " + str1.contains(str2));
        System.out.println("Comparing " + str3 + " and " + str2 + ": " + str3.contains(str2));
    }
}
