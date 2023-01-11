public class BarbarianShield extends HeavyShield{
    @Override
    public int protection() {
        return 50;
    }

    @Override
    int weight() {
        return super.weight();
    }
}
