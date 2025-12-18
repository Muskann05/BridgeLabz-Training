import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // take input base and height

        float base = sc.nextFloat();
        float height = sc.nextFloat();
        // calculate area

        float areaInInches = 0.5f * base * height;
        float areaInCm = areaInInches * 6.4516f; 
        System.out.println("The area of triangle in square inches is " + areaInInches +
                           " and in square centimeters is " + areaInCm);
    }
}
