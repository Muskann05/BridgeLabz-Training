import java.util.*;

public class SearchComparison {

    // Linear Search
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }

    // Binary Search (array must be sorted)
    public static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        // Input elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        // Input target
        System.out.print("Enter target element to search: ");
        int target = sc.nextInt();
        // Linear Search
        int linearResult = linearSearch(arr, target);
        if (linearResult != -1)
            System.out.println("Linear Search: Element found at index " + linearResult);
        else
            System.out.println("Linear Search: Element not found");
        // Sort array for Binary Search
        Arrays.sort(arr);
        // Binary Search
        int binaryResult = binarySearch(arr, target);
        if (binaryResult != -1)
            System.out.println("Binary Search: Element found at index " + binaryResult + " (after sorting)");
        else
            System.out.println("Binary Search: Element not found");
    }
}
