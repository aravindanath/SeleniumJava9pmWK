package day6;

public class ExampleEncap {

    public static void main(String[] args) {
        PersonalData pd = new PersonalData();
        pd.setName("John Doe");
        pd.setCardNumber(1234567890123456L);
        pd.setCvv(123);
        pd.setExpiryMonth(12);
        pd.setExpiryYear(2022);

        System.out.println("Name: "+pd.getName());
        System.out.println("Card Number: "+pd.getCardNumber());
        System.out.println("CVV: "+pd.getCvv());
        System.out.println("Expiry Month: "+pd.getExpiryMonth());
        System.out.println("Expiry Year: "+pd.getExpiryYear());

        pd.setName("Jane Doe");
        System.out.println("Name: "+pd.getName());
    }
}
