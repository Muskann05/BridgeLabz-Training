import java.util.Scanner;

class NumberCheck2 {

    // Method to check positive or negative
    static boolean isPositive(int num) {
        return num >= 0;
    }

    // Method to check even or odd
    static boolean isEven(int num) {
        return num % 2 == 0;
    }

    // Method to compare two numbers
    static int compare(int num1, int num2) {
        if (num1 > num2)
            return 1;
        else if (num1 == num2)
            return 0;
        else
            return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        // Taking user input
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Checking each number
        for (int i = 0; i < arr.length; i++) {
            if (isPositive(arr[i])) {
                if (isEven(arr[i])) {
                    System.out.println(arr[i] + " is Positive and Even");
                } else {
                    System.out.println(arr[i] + " is Positive and Odd");
                }
            } else {
                System.out.println(arr[i] + " is Negative");
            }
        }

        // Comparing first and last element
        int result = compare(arr[0], arr[arr.length - 1]);

        if (result == 1) {
            System.out.println("First element is Greater than Last element");
        } else if (result == 0) {
            System.out.println("First element is Equal to Last element");
        } else {
            System.out.println("First element is Less than Last element");
        }

        sc.close();
    }
}
