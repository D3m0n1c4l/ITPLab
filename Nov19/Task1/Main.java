public class Main {
    public static <T extends Main> String printContent(T object) {
        return object.print();
    }

    public static String alternativePrintContent(Book book) {
        return book.print();
    }

    public static String alternativePrintContent(Video video) {
        return video.print();
    }

    public static String alternativePrintContent(Newspaper newspaper) {
        return newspaper.print();
    }

    public String print() {
        return "Library";
    }

    public static void main(String[] args) {
        Book book = new Book("Book");
        Video video = new Video("Video");
        Newspaper newspaper = new Newspaper("Newspaper");
        System.out.println(Main.printContent(book));
        System.out.println(Main.printContent(video));
        System.out.println(Main.printContent(newspaper));
        System.out.println(Main.alternativePrintContent(book));
        System.out.println(Main.alternativePrintContent(video));
        System.out.println(Main.alternativePrintContent(newspaper));
    }
}