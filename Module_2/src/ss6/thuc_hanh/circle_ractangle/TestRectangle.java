package ss6.thuc_hanh.circle_ractangle;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rectangle =new Rectangle();
        Rectangle rectangle1= new Rectangle(2,5);
        Rectangle rectangle2 =new Rectangle(3,6,"red",false);
        System.out.println(rectangle);
        System.out.println(rectangle1);
        System.out.println(rectangle2);
    }
}
