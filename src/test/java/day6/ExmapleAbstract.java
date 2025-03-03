package day6;

public class ExmapleAbstract  extends Vehical{


    void stop() {
        System.out.println("Stop the vehical");
    }

    void service() {
        System.out.println("Service the vehical");
    }

    public static void main(String[] args) {

        ExmapleAbstract ex = new ExmapleAbstract();
        ex.start();
        ex.stop();
        ex.service();
    }
}
