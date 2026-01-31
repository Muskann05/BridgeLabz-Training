import java.util.regex.*;
import java.util.*;
public class ExtractCapitalizedWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence:");
        String text = sc.nextLine();
        String regex = "\\b[A-Z][a-z]*\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while(matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
