package day6;

//child extends parent class / super class
public class Cat extends Animal{

    public void climbTree(){
        System.out.println("Cat is climbing tree");
    }

    public void huntingRat(){
        System.out.println("Cat is hunting rat");
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.makeSound();
        cat.sleep();
        cat.eat();
        cat.tail();
        cat.fur();
        cat.climbTree();
        cat.huntingRat();
        cat.rabiesShot();
        cat.vaccinate();

    }

}
