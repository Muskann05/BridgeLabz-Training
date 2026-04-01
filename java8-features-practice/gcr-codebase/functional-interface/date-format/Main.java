import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("DD-MM-YYYY: " + Date.formatDate(today, "dd-MM-yyyy"));
        System.out.println("YYYY/MM/DD: " + Date.formatDate(today, "yyyy/MM/dd"));
    }
}
