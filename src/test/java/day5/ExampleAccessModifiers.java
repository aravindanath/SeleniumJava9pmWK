package day5;

public class ExampleAccessModifiers {

    String name = "John"; // default access modifier
    public String city = "New York"; // public access modifier
    private String country = "USA"; // private access modifier
    protected String state = "NY"; // private access modifier

    public static void main(String[] args) {

        ExampleAccessModifiers example = new ExampleAccessModifiers();
        System.out.println(example.name);
        System.out.println(example.city);
        System.out.println(example.country);
        System.out.println(example.state);
    }
}
