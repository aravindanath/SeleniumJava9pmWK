package Assignment_Ajay;//Write a Java program to check whether a given string ends with the contents of another string
//Sample Output:
//        "Python Exercises" ends with "se"? false
 //       "Python Exercise" ends with "se"? true

public class StringEndsWithCheck {
    public static void main(String[] args) {
        // Sample strings
        String str1 = "Python Exercises";
        String str2 = "Python Exercise";
        String suffix = "se";

        // Check if the strings end with the specified suffix
        System.out.println("\"" + str1 + "\" ends with \"" + suffix + "\"? " + str1.endsWith(suffix));
        System.out.println("\"" + str2 + "\" ends with \"" + suffix + "\"? " + str2.endsWith(suffix));
    }
}
