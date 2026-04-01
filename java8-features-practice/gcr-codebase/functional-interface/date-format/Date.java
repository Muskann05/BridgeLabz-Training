import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public interface Date {
    static String formatDate(LocalDate date, String pattern) {
        return date.format(DateTimeFormatter.ofPattern(pattern));
    }
}
