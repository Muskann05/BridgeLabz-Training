import java.util.Scanner;

class EmployeeBonus {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read salary and years of service
        double salary = scanner.nextDouble();
        int yearsOfService = scanner.nextInt();

        // Check bonus condition
        if (yearsOfService > 5) {
            double bonus = salary * 0.05;
            System.out.println("Bonus = " + bonus);
        } else {
            System.out.println("No Bonus");
        }
    }
}
