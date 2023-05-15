package ss6.bai_tap.lop_point_moveablepoint;

public class TestMovePoint {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(12, 16, 4, 5);
        System.out.println(movablePoint);
        MovablePoint movablePoint1 = new MovablePoint();
        movablePoint1.setSpeed(12, 54);
        movablePoint1.setXY(5, 7);
        System.out.println(movablePoint1);
        MovablePoint movablePoint2 = new MovablePoint(10, 20);
        System.out.println(movablePoint2);
    }
}
