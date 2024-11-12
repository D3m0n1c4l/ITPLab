import java.util.ArrayList;
import java.util.List;

public class AnimalsList {
    List<String> animals;

    public AnimalsList(int size) {
        this.animals = new ArrayList<>(size);
    }

    public void add(String animal) {
        this.animals.add(animal);
        System.out.println("[+] Successfully added an animal");
    }

    public void remove(int index) {
        this.animals.remove(index);
        System.out.println("[+] Successfully removed an animal");
    }

    public void update(int index, String animal) {
        this.animals.set(index, animal);
        System.out.println("[+] Successfully updated an animal");
    }

    public void display() {
        System.out.println("[?] Outputting animals:");
        for (String animal : this.animals) {
            System.out.println("> " + animal);
        }
    }
}
