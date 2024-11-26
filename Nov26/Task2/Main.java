import java.util.ArrayList;

public class Main {
    public static void generateArrayList(ArrayList<String> arrayList) {
        arrayList.add("abcdEF1035");
        arrayList.add("ABCDE");
        arrayList.add("Z0gv4501FF");
        arrayList.add("ALFMNCksjd");
        arrayList.add("HelloWorld");
    }

    public static void printArrayList(ArrayList<String> arrayList) {
        arrayList.stream()
                .sorted()
                .filter(x -> x.matches("[A-Za-z]{" + x.length() + "}"))
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(10);
        Main.generateArrayList(arrayList);
        Main.printArrayList(arrayList);
    }
}