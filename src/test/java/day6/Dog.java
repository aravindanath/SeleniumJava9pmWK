package day6;

public class Dog extends Animal{

    public void bark(){
        System.out.println("Dog is barking");
    }

    public void bite(){
        System.out.println("Dog is biting");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
        dog.sleep();
        dog.eat();
        dog.tail();
        dog.fur();
        dog.bark();
        dog.bite();
        dog.rabiesShot();
        dog.vaccinate();

    }
}
