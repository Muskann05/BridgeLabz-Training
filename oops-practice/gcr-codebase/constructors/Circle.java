import java.util.Scanner;

// Circle class
class Circle {

    double radius;

    // default constructor
    Circle() {
        this(1.0);   // constructor chaining
    }

    // parameterized constructor
    Circle(double r) {
        radius = r;
    }

    // method to display radius
    void displayRadius() {
        System.out.println("Radius of circle: " + radius);
    }

    // main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // using default constructor
        Circle c1 = new Circle();
        System.out.println("Circle created using default constructor:");
        c1.displayRadius();

        // user input
        System.out.println("Enter radius:");
        double r = sc.nextDouble();

        // using parameterized constructor
        Circle c2 = new Circle(r);
        System.out.println("Circle created using parameterized constructor:");
        c2.displayRadius();

        
    }
}
