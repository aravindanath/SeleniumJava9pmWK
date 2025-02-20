package day4;

import day5.AccessModifiers;

//child >>> Parent
public class Example3 extends AccessModifiers {

    public static void main(String[] args) {

        Example3 example = new Example3();
        example.publicMethod();
        example.protectedMethod();

    }
}
