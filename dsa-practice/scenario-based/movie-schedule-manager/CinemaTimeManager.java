import java.util.ArrayList;
import java.util.List;
public class CinemaTimeManager {
    private List<String> movieTitles = new ArrayList<>();
    private List<String> showTimes = new ArrayList<>();
    // Add movie
    public void addMovie(String title, String time) throws InvalidTimeFormatException {
        if (!isValidTimeFormat(time)) {
            throw new InvalidTimeFormatException("Invalid time format: " + time);
        }
        movieTitles.add(title);
        showTimes.add(time);
        System.out.println("Movie added successfully: " + title);
    }

    // Search movie by keyword
    public void searchMovie(String keyword) {
        boolean found = false;
        try {
            for (int i = 0; i < movieTitles.size(); i++) {
                if (movieTitles.get(i).toLowerCase().contains(keyword.toLowerCase())) {
                    System.out.println(formatMovie(i));
                    found = true;
                }
            }
            if (!found) {
                System.out.println("No movie found : " + keyword);
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Search index out of range.");
        }
    }

    // Display all movies
    public void displayAllMovies() {
        if (movieTitles.isEmpty()) {
            System.out.println("No movies scheduled.");
            return;
        }
        for (int i = 0; i < movieTitles.size(); i++) {
            System.out.println(formatMovie(i));
        }
    }

    // Generate printable report (convert list to array)
    public void generatePrintableReport() {
        String[] report = new String[movieTitles.size()];
        for (int i = 0; i < movieTitles.size(); i++) {
            report[i] = formatMovie(i);
        }
        System.out.println(" Printable Movie Report ");
        for (String record : report) {
            System.out.println(record);
        }
    }

    // Helper method to format movie output
    private String formatMovie(int index) {
        return String.format("Movie: %s | Show Time: %s",
                movieTitles.get(index), showTimes.get(index));
    }

    // Helper method to validate time format (HH:MM)
    private boolean isValidTimeFormat(String time) {
        if (!time.matches("\\d{2}:\\d{2}")) {
            return false;
        }
        String[] parts = time.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
        return hours >= 0 && hours <= 23 && minutes >= 0 && minutes <= 59;
    }
}
