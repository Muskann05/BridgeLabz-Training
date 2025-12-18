import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // take height in cm
        float heightincm= sc.nextInt();
        // convert height in feet and cm
        float inches = heightincm / 2.54f;
        int feet = (int) (inches / 12);
        float totalInches = inches % 12;
        System.out.println("Your Height in cm is " + heightincm +  " while in feet is " + feet + " and inches is " + totalInches);
        
        
    }
}