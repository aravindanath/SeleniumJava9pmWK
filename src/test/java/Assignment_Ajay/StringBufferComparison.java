package Assignment_Ajay;//Write a Java program to compare a given string to the specified string buffer
//Sample Output:
//Comparing example.com and example.com: true
//Comparing Example.com and example.com: false

public class StringBufferComparison {
    public static void main(String[] args) {
        // Define a string and a StringBuffer
        String str1 = "example.com";
        StringBuffer buffer1 = new StringBuffer("example.com");

        // Compare using equals (StringBuffer needs to be converted to String)
        boolean result1 = str1.equals(buffer1.toString());
        System.out.println("Comparing " + str1 + " and " + buffer1 + ": " + result1);

        // Another comparison with a different case
        String str2 = "Example.com";
        boolean result2 = str2.equals(buffer1.toString());
        System.out.println("Comparing " + str2 + " and " + buffer1 + ": " + result2);
    }
}