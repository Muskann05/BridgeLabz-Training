import java.util.Scanner;
class MissingNumber {
    // Method to find missing number
    public static int findMissingNumber(int[] nums) {
        int missingNumber = nums.length;
        for (int i = 0; i < nums.length; i++) {
            missingNumber += i - nums[i];
        }
        return missingNumber;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        // Input array
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        // Output
        int result = findMissingNumber(nums);
        System.out.println("Missing Number is: " + result);
    }
}
