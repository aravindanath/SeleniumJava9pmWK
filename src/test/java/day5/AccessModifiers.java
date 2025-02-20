package day5;

public class AccessModifiers {


    public void publicMethod() {
        System.out.println("This is a public method");
    }

    private void privateMethod() {
        System.out.println("This is a private method");
    }

    protected void protectedMethod() {
        System.out.println("This is a protected method");
    }

    void defaultMethod() {
        System.out.println("This is a default method");
    }


    public static void main(String[] args) {
        AccessModifiers accessModifiers = new AccessModifiers();
        accessModifiers.publicMethod();
        accessModifiers.privateMethod();
        accessModifiers.protectedMethod();
        accessModifiers.defaultMethod();
    }
}
