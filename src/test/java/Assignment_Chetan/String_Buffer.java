package Assignment_Chetan;

public class String_Buffer {

    public static void main(String[] args) {

        String str1 = "example.com";
        String str2 = "Example.com";

        StringBuffer sb = new StringBuffer("example.com");

        System.out.println("Comparing " + str1 + " and " + sb + ": "+ str1.equals(sb.toString()));
        System.out.println("Comparing " + str2 + " and " + sb + ": "+ str2.equals(sb.toString()));
    }
}
