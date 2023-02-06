package solid;

import solid.lsp.Rectangle;
import solid.lsp.Shape;
import solid.lsp.Square;

public class ViewShape {
    private Shape rectangle;

    public ViewShape(Square rectangle) {
        this.rectangle = rectangle;
    }

    public void showArea() {
        System.out.print("Площадь прямоугольника равна:");
        System.out.println(rectangle.getArea());
    }
}
