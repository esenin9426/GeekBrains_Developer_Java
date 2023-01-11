public class Archer extends Warrior<Bow>{

    public Archer(String name, int healpoint, Bow bow) {
        super(name, healpoint, bow);
    }

    public Archer(String name, int healpoint, Bow weapon, Shield shield) {
        super(name, healpoint, weapon, shield);
    }

    @Override
    public String toString() {
        return "Archer" + super.toString();
    }
}
