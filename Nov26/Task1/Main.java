import java.util.ArrayList;

public class Main {
    public static void generateArrayList(ArrayList<Integer> arrayList) {
        arrayList.add(-9);
        arrayList.add(0);
        arrayList.add(-31);
        arrayList.add(-42);
    }

    public static void displayArrayList(ArrayList<Integer> arrayList) {
        arrayList.replaceAll(Math::abs);
        arrayList.stream()
                .filter(x -> x % 3 == 0)
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(4);
        Main.generateArrayList(arrayList);
        Main.displayArrayList(arrayList);
    }
}