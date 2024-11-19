public class Dog extends Animal {
    int barkingLoudness;

    public Dog(String nickname, int barkingLoudness) {
        super(nickname);
        this.barkingLoudness = barkingLoudness;
    }

    public String voice() {
        return "woof";
    }

    public String toString() {
        return "Dog{nickname=" + this.nickname + ",purLoudness=" + this.barkingLoudness + "}";
    }
}
