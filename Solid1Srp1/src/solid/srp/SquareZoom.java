package solid.srp;

public class SquareZoom {

    private Square square;

    public SquareZoom(Square square) {
        this.square = square;
    }

    public void draw() {
        for (int i = 0; i < square.getSide(); i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i < square.getSide(); i++) {
            System.out.print("*");
            for (int j = 1; j < square.getSide() - 1; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for (int i = 0; i < square.getSide(); i++) {
            System.out.print("*");
        }
    }

}
