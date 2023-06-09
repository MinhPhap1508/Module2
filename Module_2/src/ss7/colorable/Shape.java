package ss7.colorable;

import ss7.bai_tap.interface_for_resizeable_shape.Resizeable;

public abstract class Shape {
    private String color = "green";
    private boolean filled = true;


    public Shape() {
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public abstract double getArea();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A Shape with color of " +
                getColor()
                + " and "
                + (isFilled() ? "filled" : "not filled ");
    }

}
