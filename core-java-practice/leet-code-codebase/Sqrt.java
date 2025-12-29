import java.util.Scanner;
public class Sqrt {
    public static int mySqrt(int x) {
        int a= (int)Math.sqrt(x);
        return a;
        
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x");
        int x =sc.nextInt();
        int result = mySqrt(x);
        System.out.println(result);
    }
    
}
