package ss6.bai_tap.loppoint2d_point3d;

public class TestPoint2D {
    public static void main(String[] args) {
        Point2D point = new Point2D();
        point.setX(7);
        point.setY(9);
        System.out.println(point);
        point.setXY(19, 26);
        System.out.println(point);
        Point2D point2D = new Point2D(3, 4);
        System.out.println("X: " + point2D.getX());
        System.out.println("Y: " + point2D.getY());
        System.out.println(point2D);
    }
}
