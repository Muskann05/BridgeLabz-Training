import java.util.*;
public class InsertionSort {
    public static void main(String[] args) {
        // take input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Employee");
        int number = sc.nextInt();
        // take array of employeeId
        int[] employeeId = new int[number];
        // Enter employee Id
        System.out.println("Enter Employee Id");
        for(int i = 0; i<number; i++){
            employeeId[i] = sc.nextInt();
        }
        for (int i = 1; i < number; i++) {
            int key = employeeId[i];  
            int j = i - 1;

            // Shift elements greater than key
            while (j >= 0 && employeeId[j] > key) {
                employeeId[j + 1] = employeeId[j];
                j--;
            }

            // Insert key at correct position
            employeeId[j + 1] = key;
        }

        // Step 4: Display sorted employee IDs
        System.out.println("Sorted Employee IDs (Ascending):");
        for (int id : employeeId) {
            System.out.print(id + " ");
        }
    }
    
}
