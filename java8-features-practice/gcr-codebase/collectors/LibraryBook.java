import java.util.*;
import java.util.stream.Collectors;
class Book {
    private String title;
    private String genre;
    private int pages;

    public Book(String title, String genre, int pages) {
        this.title = title;
        this.genre = genre;
        this.pages = pages;
    }

    public String getGenre() {
        return genre;
    }

    public int getPages() {
        return pages;
    }
}

public class LibraryBook {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("Java Basics", "Education", 300),
                new Book("Spring Boot", "Education", 450),
                new Book("Harry Potter", "Fiction", 500),
                new Book("The Hobbit", "Fiction", 350),
                new Book("Finance 101", "Business", 280)
        );

        Map<String, IntSummaryStatistics> statsByGenre = books.stream()
                .collect(Collectors.groupingBy(
                        Book::getGenre,
                        Collectors.summarizingInt(Book::getPages)
                ));

        System.out.println("Book statistics by genre:");
        statsByGenre.forEach((genre, stats) -> {
            System.out.println("Genre: " + genre);
            System.out.println("Total Pages: " + stats.getSum());
            System.out.println("Average Pages: " + stats.getAverage());
            System.out.println("Maximum Pages: " + stats.getMax());
        });
    }
}