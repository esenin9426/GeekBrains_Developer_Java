public class Barbarian extends Warrior<Axe>{
    public Barbarian(String name, int healpoint, Axe axe) {
        super(name, healpoint, axe);
    }

    public Barbarian(String name, int healpoint, Axe weapon, Shield shield) {
        super(name, healpoint, weapon, shield);
    }

    @Override
    public String toString() {
        return "Barbarian" + super.toString();
    }
}
