import java.util.Scanner;
public class CreditCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter credit card number:");
        String card = sc.nextLine();
        String regex = "^(4\\d{15}|5\\d{15})$";
        if(card.matches(regex)) {
            System.out.println("Valid Credit Card Number");
        } else{
            System.out.println("Invalid Credit Card Number");
        }
    }
}
