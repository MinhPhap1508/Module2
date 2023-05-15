package ss6.bai_tap.loppoint2d_point3d;

public class TestPoint3D {
    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        point3D.setXYZ(5,6,7);
        System.out.println(point3D);
        Point3D point = new Point3D(1,2,3);
        System.out.println(point);
        point3D.setX(7);
        point3D.setY(8);
        point3D.setZ(9);
        System.out.println(point3D);
    }
}
