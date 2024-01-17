import java.util.ArrayList;

public class BookStore {
    public static void populateAuthors(ArrayList<Author> authors) {
        authors.add(new Author("Malcolm Gladwell"));
        authors.add(new Author("Steven Johnson"));
        authors.add(new Author("Mathias Johansson"));
        authors.add(new Author("Evan Ackerman"));
        authors.add(new Author("Evan Ackerman"));
        authors.add(new Author("Fan Shi"));
    }

    public static void populateNovels(ArrayList<WrittenWork> products, ArrayList<Author> authors) {
        WrittenWork w1 = new Novel(authors.get(0), "What the Dog Saw and other adventures", 503);
        WrittenWork w2 = new Novel(authors.get(1), "How We Got to Now: Six Innovations That Made the Modern World",
                320);
        WrittenWork w3 = new Novel(authors.get(1),
                "Everything Bad is Good for You: How Today's Popular Culture is Actually Making Us Smarter", 254);
        products.add(w1);
        products.add(w2);
        products.add(w3);
    }

    public static void main(String[] args) {

        ArrayList<Author> authors = new ArrayList<>(6);
        populateAuthors(authors);

        ArrayList<WrittenWork> products = new ArrayList<>();
        populateNovels(products, authors);

        for (Author author : authors) {
            if (author.getNumBooksAuthored() > 0)
                System.out.println(author.toString());
        }

        WrittenWork mag = new Magazine("IEEE Spectrum");
        products.add(mag);
        mag.addAuthor(authors.get(2));
        mag.addAuthor(authors.get(3));
        mag.addAuthor(authors.get(4));
        mag.addAuthor(authors.get(5));

    }
}
