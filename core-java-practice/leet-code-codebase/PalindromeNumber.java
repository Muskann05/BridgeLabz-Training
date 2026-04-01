import java.util.Scanner;
public class PalindromeNumber {
    public static boolean isPalindrome(int num) {
        if(num<0 || (num % 10==0 && num!=0)){
            return false;
        }
        int reversedNumber = 0;
        while(num> reversedNumber){
            reversedNumber= reversedNumber * 10 + num % 10;
            num /=10;
        }
        return num==reversedNumber || num==reversedNumber/10;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isPalindrome(num)) {
            System.out.println("The number is a Palindrome");
        } else {
            System.out.println("The number is NOT a Palindrome");
        }
    }
        
}