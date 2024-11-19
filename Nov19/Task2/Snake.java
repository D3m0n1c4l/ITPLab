public class Snake extends Animal {
    int venomDanger;


    public Snake(String nickname, int id, Owner owner, int venomDanger) {
        super(nickname, id, owner);
        this.venomDanger = venomDanger;
    }

    public String toString() {
        return "Snake{nickname=" + this.nickname + ",id=" + this.id + ",owner=Owner{name=" + this.owner.name + ",surname"
                + "=" + this.owner.surname + ",age=" + this.owner.age + "},venomDanger=" + this.venomDanger + "}";
    }
}
