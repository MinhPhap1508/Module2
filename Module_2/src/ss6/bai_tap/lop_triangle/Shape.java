package ss6.bai_tap.lop_triangle;

public class Shape {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Shape() {
    }

    public Shape(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getArea() {
        return Math.sqrt(getPerimeter() * (getPerimeter() - side1) * (getPerimeter() - side2) * (getPerimeter() - side3));
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                "Perimeter= "+getPerimeter()+
                "Area= "+getArea()+
                '}';
    }
}
