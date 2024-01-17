
public class Book implements WrittenWork {
    private int numPages;
    private String title;
    private Author author;
    private double price;

    public Book(String title, int numPages) {
        this.title = title;
        this.numPages = numPages;
        this.author = null;
        this.price = 0.0;
    }

    // accessors
    public int getNumPages() {
        return numPages;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public String getAuthorName() {
        return (author != null) ? author.getName() : "Unknown Author";
    }

    public String toString() {
        return "Book Title: " + title + "\nAuthor: " + author.getName()
                + "\nNumber of Pages: " + numPages + "\nPrice: $" + getPrice();
    }

    // mutators
    public void addAuthor(Author author) {
        this.author = author;
        this.author.addNewBook();
    }

    @Override
    public boolean hasAuthor(Author a) {
        return author != null;
    }

}
