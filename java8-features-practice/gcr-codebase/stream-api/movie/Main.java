import java.util.*;
import java.util.stream.*;
public class Main {
    public static void main(String[] args) {
        List<Movie> movies = Arrays.asList(
            new Movie("A", 4.5, 2023),
            new Movie("B", 4.8, 2022),
            new Movie("C", 4.9, 2024),
            new Movie("D", 4.2, 2021),
            new Movie("E", 4.7, 2020),
            new Movie("F", 4.6, 2024)
        );
        List<Movie> top5 = movies.stream()
            .filter(m -> m.rating >= 4.5)
            .sorted(Comparator.comparing(Movie::getYear).reversed()
                    .thenComparing(Movie::getRating).reversed())
            .limit(5)
            .collect(Collectors.toList());
        top5.forEach(m -> 
            System.out.println(m.name + " " + m.rating + " " + m.year)
        );
    }
}
