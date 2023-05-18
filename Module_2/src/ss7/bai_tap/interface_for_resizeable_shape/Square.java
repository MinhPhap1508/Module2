package ss7.bai_tap.interface_for_resizeable_shape;

import ss7.colorable.Colorable;

public class Square extends Shape implements Resizeable {
    private double side = 1;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return getSide() * getSide();
    }

    public double getPerimeter() {
        return getSide() * 4;
    }

    @Override
    public String toString() {
        return " Square {" +
                " side= " + side +
                " Area= " + getArea() +
                " Perimeter = " + getPerimeter() +
                super.toString() +
                '}';
    }

    @Override
    public void resize(double percent) {
        setSide(getSide() + getSide() * (percent / 100));
    }

}
