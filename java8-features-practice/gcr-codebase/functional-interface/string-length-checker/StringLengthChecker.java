import java.util.function.Function;
public class StringLengthChecker {
    public static void main(String[] args) {
        Function<String, Integer> lengthChecker = msg -> msg.length();
        String message = "Welcome to Java";
        int length = lengthChecker.apply(message);
        System.out.println("Message length: " + length);
    }
}
