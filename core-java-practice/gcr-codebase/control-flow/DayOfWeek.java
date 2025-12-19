public class DayOfWeek {

    public static void main(String[] args) {

        // Read command-line arguments
        int month = Integer.parseInt(args[0]); // m
        int day = Integer.parseInt(args[1]);   // d
        int year = Integer.parseInt(args[2]);  // y

        // Apply given formulas (Gregorian calendar)
        int adjustedYear = year - (14 - month) / 12;

        int x = adjustedYear
                + adjustedYear / 4
                - adjustedYear / 100
                + adjustedYear / 400;

        int adjustedMonth = month + 12 * ((14 - month) / 12) - 2;

        int dayOfWeek = (day + x + (31 * adjustedMonth) / 12) % 7;

        // Output: 0 = Sunday, 1 = Monday, ..., 6 = Saturday
        System.out.println(dayOfWeek);
    }
}

