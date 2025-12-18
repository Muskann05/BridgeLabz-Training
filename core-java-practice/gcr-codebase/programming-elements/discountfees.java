import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fee = sc.nextInt();
        int discountPercent = sc.nextInt();
        // calculate discount
        int discount = (fee * discountPercent)/100;
        int discountedfee = fee - discount;
        // print discount and discountedfee
        System.out.println("The discount amount is " + discount + " and final discounted fee is " + discountedfee);
        
    }
}