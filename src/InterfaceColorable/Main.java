package InterfaceColorable;

import InterfaceColorable.Circle;
import InterfaceColorable.Rectangle;
import InterfaceColorable.Shape;
import InterfaceColorable.Square;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[6];

        shapes[0] = new Circle(10);
        shapes[1] = new Rectangle(65, 12);
        shapes[2] = new Square(8, "vang", false);
        shapes[3] = new Circle(10);
        shapes[4] = new Rectangle(65, 12);
        shapes[5] = new Square(10, "den", false);

        for (Shape shape: shapes) {
            if (shape instanceof Colorable){
                Square square = (Square) shape;
                System.out.println(square);
                System.out.println("Diện tích : " + square.getArea());
                square.howToColor();
            }
        }
    }
}
