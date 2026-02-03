import java.util.*;
public class Event{
    public static void main(String[] args) {
        List<String> attendees = Arrays.asList("Aman", "Neha", "Rohit", "Priya");
        attendees.forEach(name ->
            System.out.println("Welcome, " + name + "!")
        );
    }
}
