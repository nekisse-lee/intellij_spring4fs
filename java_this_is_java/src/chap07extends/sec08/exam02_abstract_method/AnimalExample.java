package chap07extends.sec08.exam02_abstract_method;

import chap06.AccessModifier.A.A;

public class AnimalExample {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.sound();

        cat.sound();
        System.out.println("-------");

        Animal animal = new Dog();
        animal.sound();

        animal = new Cat();
        animal.sound();
        System.out.println("-------");
        animalSound(new Cat());
        animalSound(new Dog());
    }

    public static void animalSound(Animal animal) {
        animal.sound();
    }
}
