public class Dog extends Animal implements Speakable,Runable {

    public Dog(String nickname, int legs, String owner) {
        super(nickname, legs, owner);
    }

    @Override
    public String speak() {
        return "Waw";
    }


    @Override
    public int runSpeed() {
        return 30;
    }

    @Override
    public String toString() {
        return "Dog" + super.toString();
    }
}
