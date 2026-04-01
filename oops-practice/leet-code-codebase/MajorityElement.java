import java.util.*;
public class MajorityElement {
    // Method to find majority element
    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);          
        int n = nums.length;
        return nums[n / 2];          
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Input array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Find and display majority element
        int result = majorityElement(nums);
        System.out.println("Majority Element: " + result);
        
    }
}
