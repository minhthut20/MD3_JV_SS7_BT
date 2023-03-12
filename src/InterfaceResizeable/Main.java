package InterfaceResizeable;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];

        shapes[0] = new Circle(10);
        shapes[1] = new Rectangle(65, 12);
        shapes[2] = new Square(8, "vang", false);

        for (Shape shape : shapes) {
            System.out.println(shape);
            double random = (int) (Math.random() * 100);
            System.out.println("Phần trăm phóng đại : " + random);


            if (shape instanceof Circle) {
                Circle circle = (Circle) shape;
                circle.resize(random);
            } else if (shape instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) shape;
                rectangle.resize(random);
            } else {
                Square square = (Square) shape;
                square.resize(random);
            }
            System.out.println(shape);
            System.out.println("-----------------");
        }
    }
}
