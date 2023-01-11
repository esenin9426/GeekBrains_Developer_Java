public abstract class LightShield implements Shield{

    @Override
    public String toString() {
        return String.format("защита: %d", protection());
    }
}
