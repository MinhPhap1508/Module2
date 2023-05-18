package ss7.bai_tap.interface_for_resizeable_shape;

public class Rectangle extends Shape implements Resizeable {
    private double width;
    private double length;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        return getLength()*getWidth();
    }
    public double getPerimeter(){
        return (getLength()*getWidth())*2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + getWidth() +
                ", length=" + getLength() +
                " Area= "+getArea()+
                " Perimeter= "+
                " Which subclass of "+
                super.toString()+
                '}';
    }

    @Override
    public void resize(double percent) {
        setLength(getLength()+getLength()*(percent/100));
        setWidth(getWidth()+getWidth()*(percent/100));
    }
}
