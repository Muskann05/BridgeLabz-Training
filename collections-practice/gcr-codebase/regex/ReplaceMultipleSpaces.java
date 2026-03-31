import java.util.Scanner;
public class ReplaceMultipleSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = sc.nextLine();
        String result = text.replaceAll("\\s+", " ");
        System.out.println("Modified text:");
        System.out.println(result);
    }
}
