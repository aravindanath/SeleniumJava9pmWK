package Assignment_Ajay;//Write a Java program to replace a specified character with another character
//- Sample Output:
//        - Original string: The quick brown fox jumps over the lazy dog.
 //  - New String: The quick brown fox jumps over the lazy fog.

public class ReplaceCharacter {
    public static void main(String[] args) {
        // Define the original string
        String originalString = "The quick brown fox jumps over the lazy dog.";

        // Replace 'd' with 'f'
        String newString = originalString.replace('d', 'f');

        // Print the results
        System.out.println("Original string: " + originalString);
        System.out.println("New string: " + newString);
    }
}

