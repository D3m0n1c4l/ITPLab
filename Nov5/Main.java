public class Main {
    public static void main(String[] args) {
        AnimalsList animalsList = new AnimalsList(100);
        animalsList.add("cow");
        animalsList.add("cat");
        animalsList.add("dog");
        animalsList.add("pig");
        animalsList.add("ferret");
        animalsList.remove(2);
        animalsList.update(0, "kangaroo");
        animalsList.display();
    }
}