import java.util.Scanner;

class SmallestAndLargest {
    // take input

    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int smallest = Math.min(number1, Math.min(number2, number3));
        int largest = Math.max(number1, Math.max(number2, number3));
        return new int[]{smallest, largest};
    }

    public static void main(String[] args) {
        // take input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // call method

        int[] result = findSmallestAndLargest(a, b, c);

        System.out.println("Smallest: " + result[0]);
        System.out.println("Largest: " + result[1]);
    }
}
