public abstract class Axe implements Weapon {
    @Override
    public String toString() {
        return String.format("Величина урона %d", damage());
    }
}
