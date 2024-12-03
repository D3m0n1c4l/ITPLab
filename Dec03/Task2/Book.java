import java.io.Serial;
import java.io.Serializable;

public class Book implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    public String author;
    public String title;
    public int issueYear;
    public int pageNumber;
    public int bookmark;

    public Book(String author, String title, int issueYear, int pageNumber, int bookmark) {
        this.author = author;
        this.title = title;
        this.issueYear = issueYear;
        this.pageNumber = pageNumber;
        this.bookmark = bookmark;
    }

    @Override
    public String toString() {
        return "Book{author=" + this.author + ",title=" + this.title + ",issueYear=" + this.issueYear +
                ",pageNumber=" + this.pageNumber + ",bookmark=" + this.bookmark + "}";
    }
}
