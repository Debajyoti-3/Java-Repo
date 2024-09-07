package OOPs.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shapes = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();
        circle.area();
        shapes.area();
        square.area();
    }
}
