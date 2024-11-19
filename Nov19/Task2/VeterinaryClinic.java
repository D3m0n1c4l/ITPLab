import java.util.HashMap;
import java.util.Map;

public class VeterinaryClinic {
    HashMap<Integer, Animal> storage = new HashMap<>(1000);

    public <T extends Animal> void addPet(T animal) {
        this.storage.put(animal.id, animal);
    }

    public void displayAnimals() {
        for (Integer key : this.storage.keySet()) {
            System.out.println(this.storage.get(key).toString());
        }
    }
}
