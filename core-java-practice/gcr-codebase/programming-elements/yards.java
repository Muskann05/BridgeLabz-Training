import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // take distance in feet

        float distanceInFeet = sc.nextFloat();
        // convert in yards

        float yards = distanceInFeet / 3;
        // convert in miles
        float miles = yards / 1760;

        System.out.println("The distance in yards is " + yards +
                           " and in miles is " + miles);
    }
}
