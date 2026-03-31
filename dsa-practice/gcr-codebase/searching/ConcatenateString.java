import java.util.*;
public class ConcatenateString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of strings");
        int n =sc.nextInt();
        sc.nextLine();
        String[] arr = new String[n];
        System.out.println("Enter array of strings");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextLine();

        }
        // take String buffer
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i<n ;i++){
            sb.append(arr[i]);
        }
        System.out.println("Concatenate String : " + sb.toString());


    }
    
}
