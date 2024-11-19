public class Main {
    public static void main(String[] args) {
        VeterinaryClinic veterinaryClinic = new VeterinaryClinic();
        veterinaryClinic.addPet(new Cat("cat", 1,
                new Owner("Smith", "Johnson", 25), 10));
        veterinaryClinic.addPet(new Snake("snake", 2,
                new Owner("Smith", "Johnson", 25), 100));
        veterinaryClinic.addPet(new Rabbit("rabbit", 3,
                new Owner("Smith", "Johnson", 25), 25));
//        veterinaryClinic.addPet(new Rabbit("rabbit", 3,
//                new Owner("Smith", "Johnson", 25), 26));
        veterinaryClinic.displayAnimals();
        
        // If we add an Animal to the same ID of the Map, it gets rewritten
    }
}