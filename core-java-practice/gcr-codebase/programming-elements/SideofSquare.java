import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // take input

        float perimeter = sc.nextFloat();
        // calculate side of square
        float side = perimeter / 4;

        System.out.println("The side of square is " + side +
                           " whose perimeter is " + perimeter);
    }
}
