package day6;

public class iOS implements Mobile{
    @Override
    public void call() {
        System.out.println("iOS Calling");
    }

    @Override
    public void message() {
        System.out.println("iMessage ");
    }

    @Override
    public void camera() {
        System.out.println("iOS Camera");
    }

    public static void main(String[] args) {
        iOS ios = new iOS();
        ios.call();
        ios.message();
        ios.camera();
    }
}
