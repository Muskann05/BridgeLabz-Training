import java.util.Scanner;
public class CountingSort {
    static void countingSort(int[] arr, int minAge, int maxAge) {
        int range = maxAge - minAge + 1;
        int[] count = new int[range];
        int[] output = new int[arr.length];
        // Count frequencies
        for (int i = 0; i < arr.length; i++) {
            count[arr[i] - minAge]++;
        }
        // Cumulative count
        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }

        // Build output array (stable sort)
        for (int i = arr.length - 1; i >= 0; i--) {
            int age = arr[i];
            int pos = count[age - minAge] - 1;
            output[pos] = age;
            count[age - minAge]--;
        }

        // Copy back
        for (int i = 0; i < arr.length; i++) {
            arr[i] = output[i];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[] ages = new int[n];
        System.out.println("Enter student ages (10 to 18):");
        for (int i = 0; i < n; i++) {
            ages[i] = sc.nextInt();
        }
        countingSort(ages, 10, 18);
        System.out.println("Sorted Student Ages (Ascending Order):");
        for (int age : ages) {
            System.out.print(age + " ");
        }
    }
}
