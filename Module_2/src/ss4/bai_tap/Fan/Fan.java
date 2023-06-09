package ss4.bai_tap.Fan;

public class Fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    private int speed = SLOW;
    private double radius = 5;
    private String color = "blue";
    private boolean on = false;

    public Fan() {

    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public String toString() {
        return "Fan{" + (isOn() ? "Fan is on " : "Fan is off") +
                "speed=" + speed +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                ", on=" + on +
                '}';
    }
}
