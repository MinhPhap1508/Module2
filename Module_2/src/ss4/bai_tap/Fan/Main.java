package ss4.bai_tap.Fan;

public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(3);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
        Fan fan2 = new Fan();
        fan2.setSpeed(2);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);
        System.out.println("Fan 1: Speed = " + fan1.getSpeed() + ", Radius = " + fan1.getRadius() +", Color = "+fan1.getColor()+ ", On = " + fan1.isOn());
        System.out.println("Fan 2: Speed = " + fan2.getSpeed() + ", Radius = " + fan2.getRadius() +", Color = "+fan2.getColor()+ ", On = " + fan2.isOn());

    }
}
