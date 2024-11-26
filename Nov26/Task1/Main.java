import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Main {
    public static int MIN_VALUE = -100000;
    public static int MAX_VALUE = 100000;

    public static void generateArrayList(ArrayList<Integer> arrayList, int arrayListSize) {
        for (int i = 0; i < arrayListSize; i++) {
            Random rand = new Random();
            int newElement = rand.nextInt((MAX_VALUE - MIN_VALUE) + 1) + MIN_VALUE;
            arrayList.add(newElement);
        }
    }

    public static void displayArrayList(ArrayList<Integer> arrayList) {
        if (!arrayList.isEmpty()) {
            System.out.println("[+] Output: ");
            // arrayList.replaceAll(Math::abs);
            arrayList.stream()
                    .map(x -> (x < 0) ? -x : x)
                    .filter(x -> x % 3 == 0)
                    .forEach(System.out::println);
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

    public static void main(String[] args) {
        int arrayListSize = Main.getArrayListSize();
        ArrayList<Integer> arrayList = new ArrayList<>(arrayListSize);
        Main.generateArrayList(arrayList, arrayListSize);
        Main.displayArrayList(arrayList);
    }
}