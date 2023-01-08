public class Milk extends Product{
    public Milk(String name, double price) {
        super(name, price);
    }

    public String toString()  {
        return String.format("%s", super.toString());
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public void setPrice(double price) {
        super.setPrice(price);
    }
}
