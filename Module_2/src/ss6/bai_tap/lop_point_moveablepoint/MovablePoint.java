package ss6.bai_tap.lop_point_moveablepoint;

import java.util.Arrays;

public class MovablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float[] arr = {xSpeed, ySpeed};
        return arr;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint move() {
        setX(getX() + getXSpeed());
        setY(getY() + getYSpeed());
        return this;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                super.toString()+
                " xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                " Speed= " + Arrays.toString(getSpeed()) +
                '}';
    }

}
