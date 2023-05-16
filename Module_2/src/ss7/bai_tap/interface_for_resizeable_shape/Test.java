package ss7.bai_tap.interface_for_resizeable_shape;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle("blue", true, 7);
        shapes[1] = new Rectangle("red", false, 5, 12);
        shapes[2] = new Square("yellow", true, 5);
        for (Shape index : shapes) {
            index.resize(10);
            System.out.println(index);

        }
    }
}
