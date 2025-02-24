package Assignment_Chetan;

public class Remove_Duplicate {

    public static void main(String[] args) {

        String str = "w3resource";

        System.out.println("The given string is: " + str);

        System.out.println("After removing duplicate characters the new string is: " + removeDuplicate(str));
    }

    private static String removeDuplicate(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (!sb.toString().contains(String.valueOf(str.charAt(i)))) {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
}
