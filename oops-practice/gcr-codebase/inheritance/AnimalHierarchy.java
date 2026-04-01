// Superclass
class Animal {
    String name;
    int age;

    // Constructor
    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to be overridden
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass Dog
class Dog extends Animal {

    Dog(String name, int age) {
        super(name, age);
    }

    // Overriding method
    void makeSound() {
        System.out.println(name + " says: Woof Woof");
    }
}

// Subclass Cat
class Cat extends Animal {

    Cat(String name, int age) {
        super(name, age);
    }

    // Overriding method
    void makeSound() {
        System.out.println(name + " says: Meow Meow");
    }
}

// Subclass Bird
class Bird extends Animal {

    Bird(String name, int age) {
        super(name, age);
    }

    // Overriding method
    void makeSound() {
        System.out.println(name + " says: Chirp Chirp");
    }
}

// Main class
public class AnimalHierarchy {
    public static void main(String[] args) {

        // Polymorphism: parent reference, child object
        Animal a1 = new Dog("Buddy", 3);
        Animal a2 = new Cat("Kitty", 2);
        Animal a3 = new Bird("Tweety", 1);

        // Method calls
        a1.makeSound();
        a2.makeSound();
        a3.makeSound();
    }
}
