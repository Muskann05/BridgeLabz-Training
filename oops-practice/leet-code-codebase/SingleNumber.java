import java.util.Scanner;
class SingleNumber {
    // Method to find the single number using XOR
    public static int findSingleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result = result ^ num; 
        }
        return result;
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
        // Find and display single number
        int single = findSingleNumber(nums);
        System.out.println("Single Number is: " + single);
    }
}
