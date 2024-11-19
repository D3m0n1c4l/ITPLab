public class Cat extends Animal {
    public int purLoudness;

    public Cat(String nickname, int id, Owner owner, int purLoudness) {
        super(nickname, id, owner);
        this.purLoudness = purLoudness;
    }

    public String toString() {
        return "Cat{nickname=" + this.nickname + ",id=" + this.id + ",owner=Owner{name=" + this.owner.name + ",surname"
                + "=" + this.owner.surname + ",age=" + this.owner.age + "},purLoudness=" + this.purLoudness + "}";
    }
}

