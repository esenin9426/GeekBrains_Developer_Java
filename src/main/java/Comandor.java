public class Comandor extends Warrior {

    public Comandor(String name, int healpoint, Weapon weapon) {
        super(name, healpoint, weapon);
    }

    @Override
    public String toString() {
        return "Comandor" + super.toString();
    }
}
