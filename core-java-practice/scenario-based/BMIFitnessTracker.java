import java.util.Scanner;

public class BMIFitnessTracker {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Take height  (in meters)
        System.out.print("Enter height in meters: ");
        double height = scanner.nextDouble();

        // Take weight  (in kilograms)
        System.out.print("Enter weight in kilograms: ");
        double weight = scanner.nextDouble();

        // Calculate BMI 
        double bmi = weight / (height * height);

        // print BMI value
        System.out.println("Your BMI is: " + bmi);

        // Calculate BMI category
        if (bmi < 18.5) {
            System.out.println("Category: Underweight");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Category: Normal");
        } else {
            System.out.println("Category: Overweight");
        }
    }
}
