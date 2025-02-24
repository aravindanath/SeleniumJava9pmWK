package day5;

public class Calculator {


    public void addTwoNumbers(int x, int y){
        int sum = x+y;
        System.out.println("Sum of two numbers: "+sum);
    }


    public int addThreeNumbers(int x, int y,int z){
        int sum = x+y+z;
        return sum;
    }

    public static void main(String[] args) {


        Calculator calculator = new Calculator();
      int x =  calculator.addThreeNumbers(10,20,30);
        System.out.println("Sum of three numbers: "+x);
        System.out.println(x*10/2 );

        calculator.addTwoNumbers(222,22);

    }
}
