public class Newspaper extends Main {
    private final String content;

    public Newspaper(String content) {
        this.content = content;
    }

    public String print() {
        return this.content;
    }
}
