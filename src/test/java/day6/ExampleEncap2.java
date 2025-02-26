package day6;

public class ExampleEncap2 {

    public static void main(String[] args) {

        PersonalDataUsingLombok pl = new PersonalDataUsingLombok();
        pl.setName("John Doe");
        pl.setCardNumber(1234567890123456L);
        pl.setCvv(123);

        System.out.println("Name: "+pl.getName());
        System.out.println("Card Number: "+pl.getCardNumber());
        System.out.println("CVV: "+pl.getCvv());

    }
}
