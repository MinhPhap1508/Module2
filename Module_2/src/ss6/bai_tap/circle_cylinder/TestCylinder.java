package ss6.bai_tap.circle_cylinder;

public class TestCylinder {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(3);
        circle.setColor("white");
        Circle circle1 = new Circle(4, "purple");
        Cylinder cylinder = new Cylinder();
        cylinder.setHeight(6);
        cylinder.setRadius(2);
        cylinder.setColor("orange");
        Cylinder cylinder1 = new Cylinder(5, "yellow", 5);
        System.out.println(cylinder1);
        System.out.println(cylinder);
        System.out.println(circle1);
        System.out.println(circle);
    }
}
