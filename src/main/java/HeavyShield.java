public abstract class HeavyShield implements Shield{
    int weight() {
        return 50;
    }

    @Override
    public String toString() {
        return String.format("защита: %d, вес:%d", protection(), weight());
    }
}
