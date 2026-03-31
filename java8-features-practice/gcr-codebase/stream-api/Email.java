import java.util.*;
public class Email{
    public static void main(String[] args) {
        List<String> emails = Arrays.asList(
            "a@gmail.com", "b@gmail.com", "c@gmail.com"
        );
        emails.forEach(email -> sendEmailNotification(email));
    }
    static void sendEmailNotification(String email) {
        System.out.println("Email sent to: " + email);
    }
}
