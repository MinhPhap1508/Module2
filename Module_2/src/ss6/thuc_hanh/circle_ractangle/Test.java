package ss6.thuc_hanh.circle_ractangle;

public class Test {
    public static void main(String[] args) {
        Circle circle =new Circle();
        Circle circle1 =new Circle(2);
        Circle circle2 =new Circle(2,"black",false);
        System.out.println(circle);
        System.out.println(circle1);
        System.out.println(circle1.getArea());
        System.out.println(circle2);
    }
}
