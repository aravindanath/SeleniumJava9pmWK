package day1;

public class Operators {
    int age = 10;

    public static void main(String[] args) {
        // local
        int x = 10;
        int y = 3;

        int sum = x+y;
        System.out.println("Sum of two numbers: "+sum);
        int mul = x*y;
        System.out.println("Mul of two numbers: "+mul);
        int div = x/y;
        System.out.println("Div of two numbers: "+div);
        int modulo = x%y;
        System.out.println("Modulo of two numbers: "+modulo);

        x++;
        System.out.println("Increment of x: "+x);
        y--;
        System.out.println("Decrement of y: "+y);

        System.out.println(Math.sqrt(sum));

    }
}
