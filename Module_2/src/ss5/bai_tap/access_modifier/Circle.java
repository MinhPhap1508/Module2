package ss5.bai_tap.access_modifier;

public class Circle {
    double radius=1.0;
  static String color="red";
    public Circle (){
    }
    public Circle(double r){
        radius=r;
    }
    // dùng từ khóa this để phân biệt tham số radius và trường radius.
    // public Circle(double radius){
    //       this.radius=radius;
    //    }
    public double getRadius(){
  return radius;
    }
    public double getArea(){
        return radius*radius*3.14;
    }
}
