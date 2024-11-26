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
        arrayList.replaceAll(Math::abs);
        arrayList.stream()
                .filter(x -> x % 3 == 0)
                .forEach(System.out::println);
    }

    public static int getArrayListSize() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        int arrayListSize = Main.getArrayListSize();
        ArrayList<Integer> arrayList = new ArrayList<>(arrayListSize);
        Main.generateArrayList(arrayList, arrayListSize);
        Main.displayArrayList(arrayList);
    }
}