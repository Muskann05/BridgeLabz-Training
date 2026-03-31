public class Movie {
    String name;
    double rating;
    int year;
    public Movie(String name, double rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }
    public int getYear() {
        return year;
    }
    public double getRating() {
        return rating;
    }
}
