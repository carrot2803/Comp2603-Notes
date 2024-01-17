
public class Novel extends Book {

    public Novel(Author a, String title, int numPages) {
        super(title, numPages);
        super.addAuthor(a);
    }

    @Override
    public double getPrice() {
        final double rate = 0.75;
        return rate * super.getNumPages();
    }

    @Override
    public String toString() {
        return "Novel " + super.toString();
    }

}
