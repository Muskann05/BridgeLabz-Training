public class Main {
	public static void main(String[] args) {
		Class<Book> cls = Book.class;
        // Get annotation
        Author author = cls.getAnnotation(Author.class);
        // Print value
        if (author != null) {
            System.out.println("Author Name: " + author.name());
        }
	}

}
