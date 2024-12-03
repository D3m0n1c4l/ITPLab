import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class ReaderLibrary {
    public static final String PATH = "src/serialized.dat";
    public static final int CAPACITY = 20;

    public static void addMyReadBooks(List<Book> books, String serializedFilePath) {
        try (FileOutputStream fileOut = new FileOutputStream(serializedFilePath);
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            for (Book book : books) {
                out.writeObject(book);
            }
            System.out.println("Serialized data is saved in " + serializedFilePath);
        } catch (IOException i) {
            System.out.println("An error has occurred");
        }
    }
    public static List<Book> getMySerializedBooks(String serializedFilePath) {
        List<Book> books = new ArrayList<>(CAPACITY);
        try (FileInputStream fileIn = new FileInputStream(serializedFilePath);
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            for (int i = 0; i < CAPACITY; i++) {
                Book book = (Book) in.readObject();
                books.add(book);
            }
        } catch (IOException i) {
            System.out.println("An error has occurred");
        } catch (ClassNotFoundException c) {
            System.out.println("Book class not found");
        }

        return books;
    }
    public static void displayMyBooks(List<Book> books) {
        for (Book book : books) {
            System.out.println(book.toString());
        }
    }
    public static void fillInBooks(List<Book> books, int capacity) {
        for (int i = 0; i < capacity; i++) {
            Book book = new Book("J. K. Rowling", "Harry Potter", 2021, 154, 1);
            books.add(book);
        }
    }
    public static void main(String[] args) {
//        List<Book> books = new ArrayList<>(CAPACITY);
//        fillInBooks(books, CAPACITY);
//        addMyReadBooks(books, PATH);
        List<Book> books = getMySerializedBooks(PATH);
        displayMyBooks(books);
    }
}