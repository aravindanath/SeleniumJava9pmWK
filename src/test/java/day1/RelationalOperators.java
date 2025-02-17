package day1;

public class RelationalOperators {

    /*
    == , Equal to.
    != , Not equal to.
    < , Less than.
    <= , Less than or equal to.
    > , Greater than.
    >= , Greater than or equal to.
     */

    public static void main(String[] args) {

        int x = 10;
        int y = 20;

        System.out.println(x == y); // false
        System.out.println(x < y); // true
        System.out.println(x>y); // false
        System.out.println(x=y); // true // Assigning operator
        System.out.println(x>=y);

        System.out.println(x<y && x>y); // false
        System.out.println(x<y || x<y); // false


    }
}
