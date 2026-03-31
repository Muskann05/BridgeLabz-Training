import java.util.*;
public class ReverseString {
    public static void main(String[] args) {
        // take input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String s = sc.nextLine(); 
        // take String Builder
        StringBuilder sb = new StringBuilder();
        // perform operation
        sb.append(s);
        sb.reverse();
        // convert into string
        String result = sb.toString();
        System.out.println("Reverse String : " + result);

    }
    
}
