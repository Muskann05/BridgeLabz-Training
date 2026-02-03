import java.time.*;
import java.util.*;
class Member {
    String name;
    LocalDate expiryDate;

    Member(String name, LocalDate expiryDate) {
        this.name = name;
        this.expiryDate = expiryDate;
    }
}
public class GYM {
    public static void main(String[] args) {
        List<Member> members = Arrays.asList(
            new Member("Aman", LocalDate.now().plusDays(10)),
            new Member("Neha", LocalDate.now().plusDays(40)),
            new Member("Rohit", LocalDate.now().plusDays(25)),
            new Member("Priya", LocalDate.now().plusDays(5))
        );
        members.stream()
            .filter(m -> !m.expiryDate.isAfter(LocalDate.now().plusDays(30)))
            .forEach(m ->
                System.out.println(m.name + " expires on " + m.expiryDate)
            );
    }
}
