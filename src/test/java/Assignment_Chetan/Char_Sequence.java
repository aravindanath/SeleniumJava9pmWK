package Assignment_Chetan;

public class Char_Sequence {

    public static void main(String[] args) {

        String str1 = "Comparing example.com";
        String str2 = "Comparing Example.com";

        String sequence = "example.com";

        System.out.println(str1 + " and " + sequence + ": "+ (str1.contains(sequence)));
        System.out.println(str2 + " and " + sequence + ": "+ (str2.contains(sequence)));
    }
}
