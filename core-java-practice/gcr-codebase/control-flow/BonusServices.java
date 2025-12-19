import java.util.Scanner;

class EmployeeBonus {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Take salary input
        double salary = scanner.nextDouble();

        // Take years of service
        int yearsOfService = scanner.nextInt();

        // Check bonus condition
        if (yearsOfService > 5) {
            double bonus = salary * 0.05;
            System.out.println("Bonus amount is " + bonus);
        } else {
            System.out.println("No bonus");
        }
    }
}
