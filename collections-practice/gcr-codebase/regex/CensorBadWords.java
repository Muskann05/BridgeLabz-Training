import java.util.Scanner;
public class CensorBadWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence:");
        String text = sc.nextLine();
        String regex = "\\b(damn|stupid)\\b";
        String result = text.replaceAll(regex, "****");
        System.out.println("Censored sentence:");
        System.out.println(result);
    }
}
