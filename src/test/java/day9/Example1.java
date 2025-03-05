package day9;

public class Example1 {
    public static void main(String[] args){

        int amt = 99;

        if(amt > 100) {
            System.out.println("You can withdraw");
        }else{
            try {
                throw new Exception("You can't withdraw'");
            } catch (Exception e) {
               e.printStackTrace();
            }
        }

    }
}
