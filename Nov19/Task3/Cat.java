public class Cat extends Animal {
    public int purLoudness;

    public Cat(String nickname, int purLoudness) {
        super(nickname);
        this.purLoudness = purLoudness;
    }

    public String voice() {
        return "meow";
    }

    public String toString() {
        return "Cat{nickname=" + this.nickname + ",purLoudness=" + this.purLoudness + "}";
    }
}
