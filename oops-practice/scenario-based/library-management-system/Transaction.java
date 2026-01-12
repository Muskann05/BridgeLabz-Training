public class Transaction {

    private Book book;
    private Member member;

    public Transaction(Book book, Member member) {
        this.book = book;
        this.member = member;
    }

    public void issue() throws BookNotAvailableException {
        book.issueBook();
        System.out.println("Book issued to " + member.name);
    }

    public void returnBook(int lateDays) {
        book.returnBook();
        double fine = member.calculateFine(lateDays);
        System.out.println("Book returned by " + member.name);
        System.out.println("Late Fine: ₹" + fine);
    }
}
