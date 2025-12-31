import java.util.Scanner;

// Person class
class Person {

    // attributes
    String name;
    int age;

    // parameterized constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // copy constructor
    Person(Person p) {
        this.name = p.name;
        this.age = p.age;
    }

    // method to display details
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println();
    }

    // main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // user input
        System.out.println("Enter person name:");
        String name = sc.nextLine();

        System.out.println("Enter person age:");
        int age = sc.nextInt();

        // original object
        Person p1 = new Person(name, age);
        System.out.println("Original Person:");
        p1.displayDetails();

        // copied object using copy constructor
        Person p2 = new Person(p1);
        System.out.println("Copied Person:");
        p2.displayDetails();

        
    }
}
