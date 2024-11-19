import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Animal> animals = new HashSet<>(2);
        HashSet<Dog> dogs = new HashSet<>(2);
        HashSet<Cat> cats = new HashSet<>(2);

        animals.add(new Cat("cat", 10));
        animals.add(new Dog("dog", 15));

//        dogs.add(new Cat("cat", 10));
        dogs.add(new Dog("dog", 15));

        cats.add(new Cat("cat", 10));
//        cats.add(new Dog("dog", 15));

        Main.displayAnimals(animals);
        Main.displayAnimals(dogs);
        Main.displayAnimals(cats);

        Main.makeTalk(animals);
        Main.makeTalk(dogs);
        Main.makeTalk(cats);

        Main.addAnimal(animals, new Cat("new cat", 1));
        Main.addAnimal(animals, new Dog("new dog", 2));

        Main.addAnimal(cats, new Cat("new cat", 1));
//        Main.addAnimal(cats, new Dog("new dog", 2));

//        Main.addAnimal(dogs, new Cat("new cat", 1));
        Main.addAnimal(dogs, new Dog("new dog", 2));
    }

    public static <T extends Animal> void displayAnimals(HashSet<T> set) {
        for (T animal : set) {
            System.out.println(animal.toString());
        }
    }

    public static <T extends Animal> void makeTalk(HashSet<T> set) {
        for (T animal : set) {
            System.out.println(animal.voice());
        }
    }

    public static <T extends Animal> void addAnimal(HashSet<T> set, T animal) {
        set.add(animal);
    }
}