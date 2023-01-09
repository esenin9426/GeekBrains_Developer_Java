public class Elephant extends Animal implements Runable,Swimable,Speakable{

    public Elephant(String nickname, int legs, String owner) {
        super(nickname, legs, owner);
    }

    @Override
    public String toString() {
        return "Elephant" + super.toString();
    }

    @Override
    public int runSpeed() {
        return 24;
    }

    @Override
    public String speak() {
        return "vuiuuiuuu";
    }

    @Override
    public int swimSpeed() {
        return 7;
    }
}
