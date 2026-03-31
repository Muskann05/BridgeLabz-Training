import java.util.*;
public class SearchOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input array
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Linear Search for First Missing Positive
        boolean[] present = new boolean[n + 1]; 
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0 && arr[i] <= n) {
                present[arr[i]] = true;
            }
        }
        int missing = 1;
        for (int i = 1; i <= n; i++) {
            if (!present[i]) {
                missing = i;
                break;
            }
        }
        System.out.println("First missing positive integer: " + missing);
        // Binary Search for Target
        System.out.print("Enter target number to search: ");
        int target = sc.nextInt();
        // sort array first
        Arrays.sort(arr); 
        int index = binarySearch(arr, target);
        System.out.println("Index of target after sorting: " + index);
    }
    // Binary search method
    static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
