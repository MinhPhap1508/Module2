package ss7.bai_tap.interface_for_resizeable_shape;

public class Circle extends Shape implements Resizeable {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                super.toString() +
                " radius= " + radius +
                " Area= "+getArea()+
                " Perimeter= "+getPerimeter()+
                '}';
    }

    public void resize(double percent) {
       setRadius(getRadius()+getRadius()*(percent/ 100));
    }

}
