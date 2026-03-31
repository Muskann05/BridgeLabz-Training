public class CinemaTime {
       public static void main(String[] args) {
        CinemaTimeManager manager = new CinemaTimeManager();
        try {
            // Add movies
            manager.addMovie("Avengers: Endgame", "18:30");
            manager.addMovie("Inception", "21:15");
            manager.addMovie("Interstellar", "16:45");
            // Invalid time example, Will throw exception
            manager.addMovie("Fast & Furious", "25:99"); 
        } catch (InvalidTimeFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Display all movies
        System.out.println("\nAll Movies:");
        manager.displayAllMovies();

        // Search movies
        System.out.println("\nSearch Results for 'in':");
        manager.searchMovie("in");

        // Generate printable report
        manager.generatePrintableReport();
    }
}
