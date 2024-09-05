package OOP.Polymorphism;

public class Animal {
    public void makeSound() {
        System.out.println("Animal is making sound");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Dog is barking");
    }
}

class Cat extends Animal {
    public void makeSound() {
        System.out.println("Cat is meowing");
    }
}
