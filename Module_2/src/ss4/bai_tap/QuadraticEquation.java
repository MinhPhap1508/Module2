package ss4.bai_tap;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập c: ");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        if (quadraticEquation.getDiscriminant()>=0){
            System.out.print("Phương trình có 2 nghiệm: "+quadraticEquation.getRoot1()+" and "+quadraticEquation.getRoot2());
        }else {
            System.out.print("Phương trình vô nghiệm");
        }
    }
     double a,b,c;
    public QuadraticEquation(double a, double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public double getA(){
        return a;
    }
    public double getB(){
        return b;
    }
    public double getC(){
        return c;
    }
    public double getDiscriminant(){
        return b*b-4*a*c;
    }
    public double getRoot1(){
        return (-b+Math.sqrt(getDiscriminant()))/(2*a);
    }
    public double getRoot2(){
        return (-b-Math.sqrt(getDiscriminant()))/(2*a);
    }
}
