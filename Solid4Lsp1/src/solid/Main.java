package solid;

import solid.lsp.Rectangle;
import solid.lsp.Shape;
import solid.lsp.Square;

public class Main {
    public static void main(String[] args) {
        Square rectangle = new Square(5);
        rectangle.setSide(6);
        System.out.printf("В квадрате сторона = %d\n", rectangle.getSide());
        ViewShape view;
        view = new ViewShape(rectangle);
        view.showArea();
    }
}
