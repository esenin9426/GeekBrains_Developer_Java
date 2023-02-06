package solid.lsp;

public class Square implements Shape {

    int side = 0;

    public int getSide() {
        return side;
    }

    public Square(int side) {
        this.side = side;
    }

    public void setSide(int side) {
        this.side = side;
    }
    @Override
    public double getArea() {
        return (int) Math.pow(getSide(), 2);
    }
}
