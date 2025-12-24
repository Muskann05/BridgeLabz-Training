import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI for all persons
    static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightCm = data[i][1];
            double heightM = heightCm / 100;   // convert cm to meter
            data[i][2] = weight / (heightM * heightM);
        }
    }

    // Method to determine BMI status
    static String[] getBMIStatus(double[][] data) {
        String[] status = new String[data.length];

        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];

            if (bmi <= 18.4)
                status[i] = "Underweight";
            else if (bmi <= 24.9)
                status[i] = "Normal";
            else if (bmi <= 39.9)
                status[i] = "Overweight";
            else
                status[i] = "Obese";
        }
        return status;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 2D array: weight, height, BMI
        double[][] persons = new double[10][3];

        // Input weight and height
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for Person " + (i + 1));
            System.out.print("Weight (kg): ");
            persons[i][0] = sc.nextDouble();

            System.out.print("Height (cm): ");
            persons[i][1] = sc.nextDouble();
        }

        // Calculate BMI
        calculateBMI(persons);

        // Get BMI Status
        String[] status = getBMIStatus(persons);

        // Display result
        System.out.println("\nPerson\tWeight\tHeight\tBMI\t\tStatus");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d\t%.1f\t%.1f\t%.2f\t%s\n",
                    (i + 1),
                    persons[i][0],
                    persons[i][1],
                    persons[i][2],
                    status[i]);
        }

        sc.close();
    }
}
