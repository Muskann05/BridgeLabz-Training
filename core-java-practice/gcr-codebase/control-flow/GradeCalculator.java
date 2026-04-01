import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input marks
        System.out.print("Enter Physics marks: ");
        double physics = sc.nextDouble();
        System.out.print("Enter Chemistry marks: ");
        double chemistry = sc.nextDouble();
        System.out.print("Enter Maths marks: ");
        double maths = sc.nextDouble();

        // Calculate percentage
        double percentage = (physics + chemistry + maths) / 3;

        System.out.println("Percentage: " + percentage);

        // Grade logic
        if (percentage >= 80)
            System.out.println("Grade A");
        else if (percentage >= 70)
            System.out.println("Grade B");
        else if (percentage >= 60)
            System.out.println("Grade C");
        else if (percentage >= 50)
            System.out.println("Grade D");
        else if (percentage >= 40)
            System.out.println("Grade E");
        else
            System.out.println("Grade R (Remedial)");
    }
}
