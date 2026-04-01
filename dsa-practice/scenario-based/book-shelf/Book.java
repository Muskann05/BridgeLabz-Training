public class Book {
    String title;
    String author;
    String genre;
    // Constructor
    public Book(String title, String author, String genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
    }
    public String toString() {
        return title + " by " + author;
    }
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Book)) return false;
        Book b = (Book) obj;
        return title.equals(b.title) && author.equals(b.author) && genre.equals(b.genre);
    }
    public int hashCode() {
        return title.hashCode() + author.hashCode() + genre.hashCode();
    }
}
