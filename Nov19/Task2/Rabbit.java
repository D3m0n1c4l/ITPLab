public class Rabbit extends Animal {
    int earLength;


    public Rabbit(String nickname, int id, Owner owner, int earLength) {
        super(nickname, id, owner);
        this.earLength = earLength;
    }

    public String toString() {
        return "Rabbit{nickname=" + this.nickname + ",id=" + this.id + ",owner=Owner{name=" + this.owner.name + ",surname"
                + "=" + this.owner.surname + ",age=" + this.owner.age + "},earLength=" + this.earLength + "}";
    }
}
