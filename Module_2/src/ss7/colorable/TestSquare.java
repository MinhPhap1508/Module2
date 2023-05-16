package ss7.colorable;

public class TestSquare {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle("red", true, 5);
        shapes[1] = new Square("black", true, 6);
        shapes[2] = new Rectangle("blue", false, 4, 12);
        for (Shape index : shapes) {
            System.out.println("Area= " + index.getArea());
            if (index instanceof Colorable) {
                ((Colorable) index).howToColor();
            }
        }
    }
}
