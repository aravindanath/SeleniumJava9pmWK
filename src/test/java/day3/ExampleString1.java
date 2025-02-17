package day3;

public class ExampleString1 {

    public static void main(String[] args) {
            //        0123456
        String name ="Arvind";
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name=="ARvind");
        System.out.println(name.equals("ARvind"));
        System.out.println(name.equalsIgnoreCase("ARvind"));
        System.out.println(name.contains("ind"));
        System.out.println(name.startsWith("Ar"));
        System.out.println(name.endsWith("nd"));
        System.out.println(name.charAt(3));
        System.out.println(name.indexOf("v"));
        System.out.println(name.isEmpty());
        System.out.println(name.isBlank());

        String name1 ="Arvind";
        String name2 = "Sharma";
        System.out.println(name1.concat(name2));

    }

}
