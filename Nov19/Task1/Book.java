public class Book extends Main {
    private final String content;

    public Book(String content) {
        this.content = content;
    }

    public String print() {
        return this.content;
    }
}
