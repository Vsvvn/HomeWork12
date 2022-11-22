public class Book {

    private int yearPublishing;
    private String publisher;
    private Author author;

    public Book(Author author, String publisher, int yearPublishing) {
        this.yearPublishing = yearPublishing;
        this.publisher = publisher;
        this.author = author;
    }

    public int getYearPublishing() {
        return this.yearPublishing;
    }

    public String getPublisher() {
        return this.publisher;
    }

    public Author getAuthor() {
        return this.author;
    }

    public void setYear(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }
}
