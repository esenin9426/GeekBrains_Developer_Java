public class Penguin extends Animal implements Swimable,Runable,Speakable{

    public Penguin(String nickname, int legs, String owner) {
        super(nickname, legs, owner);
    }


    @Override
    public String toString() {
        return "Penguin" + super.toString();
    }

    @Override
    public int runSpeed() {
        return 15;
    }

    @Override
    public String speak() {
        return "piipiippi";
    }

    @Override
    public int swimSpeed() {
        return 100;
    }
}
