import java.util.Scanner;

class LeapYearCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // Check for Gregorian calendar year
        if (year < 1582) {
            System.out.println("Leap year check is valid only for year >= 1582.");
            return;
        }

        if (isLeapYear(year)) {
            System.out.println("Year is a Leap Year");
        } else {
            System.out.println("Year is not a Leap Year");
        }
    }

    // Method to check leap year
    static boolean isLeapYear(int year) {
        // Condition a and b
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}

