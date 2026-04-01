import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeZones{
    public static void main(String[] args) {
        // different time zones
        ZonedDateTime gmt = ZonedDateTime.now(ZoneId.of("GMT"));
        ZonedDateTime ist = ZonedDateTime.now(ZoneId.of("Asia"));
        ZonedDateTime pst = ZonedDateTime.now(ZoneId.of("America"));
        
        // display time in different zones
        System.out.println("Current Time in GMT: " + gmt);
        System.out.println("Current Time in IST: " + ist);
        System.out.println("Current Time in PST: " + pst);




        
    }
}