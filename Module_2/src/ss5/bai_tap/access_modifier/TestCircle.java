package ss5.bai_tap.access_modifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Circle circle1 = new Circle(2);
        System.out.println("Bán kính là: "+circle.getRadius()+", diện tích là: "+circle.getArea()+", có màu là: "+Circle.color);
        System.out.println("Bán kính là: "+circle1.getRadius()+", diện tích là: "+circle1.getArea()+", có màu là: "+Circle.color);
    }
}
