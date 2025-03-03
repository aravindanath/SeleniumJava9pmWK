package day6;

public class Android implements Mobile{

    public void call() {
        System.out.println("Calling");
    }


    public void message() {
        System.out.println("message");
    }


    public void camera() {
        System.out.println("camera");
    }

    public static void main(String[] args) {

        Android android = new Android();
        android.call();
        android.message();
        android.camera();
    }
}
