import java.util.Scanner;

public class MultiplicationTableArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number;
        // take array 
        int[] table = new int[10];

        // Taking input from user
        System.out.print("Enter a number: ");
        number = sc.nextInt();

        // Loop to calculate multiplication table
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = number * i;
        }

        // Display multiplication table
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + table[i - 1]);
        }
    }
}
