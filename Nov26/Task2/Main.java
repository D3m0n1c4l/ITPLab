import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Main {
    static int MIN_WORD_SIZE = 10;
    static int MAX_WORD_SIZE = 50;

    static int MIN_ASCII = 65;
    static int MAX_ASCII = 122;

    public static void generateArrayList(ArrayList<String> arrayList, int arrayListSize) {
        for (int i = 0; i < arrayListSize; i++) {
            int word_size =  new Random().nextInt((MAX_WORD_SIZE - MIN_WORD_SIZE) + 1) + MIN_WORD_SIZE;
            StringBuilder stringBuilder = new StringBuilder(word_size);
            for (int character = 0; character < word_size; character++) {
                char word_part = (char)(new Random().nextInt((MAX_ASCII - MIN_ASCII) + 1) + MIN_ASCII);
                stringBuilder.append(word_part);
            }
            arrayList.add(stringBuilder.toString());
            arrayList.add(stringBuilder.toString());
        }
    }

    public static int getArrayListSize() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("[?] Enter the array size: ");
        String input = scanner.nextLine();
        try {
            int arrayListSize = Integer.parseInt(input);
            if (arrayListSize < 0) {
                System.out.println("[!] Invalid input.");
                return 0;
            } else {
                return arrayListSize;
            }
        } catch (NumberFormatException exception) {
            System.out.println("[!] Invalid input.");
            return 0;
        }
    }

    public static void printArrayList(ArrayList<String> arrayList) {
        if (!arrayList.isEmpty()) {
            System.out.println("[+] Output: ");
            arrayList.stream()
                    .sorted()
                    .filter(x -> x.matches("[A-Za-z]{" + x.length() + "}"))
                    .forEach(System.out::println);
        }
    }

    public static void main(String[] args) {
        int arrayListSize = Main.getArrayListSize();
        ArrayList<String> arrayList = new ArrayList<>(arrayListSize*2);
        Main.generateArrayList(arrayList, arrayListSize);
        Main.printArrayList(arrayList);
    }
}