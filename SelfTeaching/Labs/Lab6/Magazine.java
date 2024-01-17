import java.util.ArrayList;

public class Magazine implements WrittenWork {
    public String title;
    private ArrayList<Author> authors;

    public Magazine(String title) {
        this.title = title;
        this.authors = new ArrayList<>();
    }

    // accessors
    public String getAuthorName() {
        String s = "";
        for (Author author : authors)
            s += author.getName();
        return s;
    }

    public String getTitle() {
        return title;
    }

    public int getNumPages() {
        return this.authors.size() * 3;
    }

    public double getPrice() {
        return 50.00;
    }

    // mutators
    public void addAuthor(Author a) {
        this.authors.add(a);
    }

    public boolean hasAuthor(Author a) {
        return authors.size() > 0;
    }

}
