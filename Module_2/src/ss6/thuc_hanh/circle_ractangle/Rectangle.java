package ss6.thuc_hanh.circle_ractangle;

public class Rectangle extends Shape {
    private double width;
    private double length;
    public Rectangle (){

    }
    public Rectangle(double width,double length){
this.width=width;
this.length=length;
    }
    public Rectangle(double width,double length,String color,boolean filled){
        super(color,filled);
        this.length=length;
        this.width=width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        return this.width*this.length;
    }
    public double getPerimeter(){
        return (this.width+this.length)*2;
    }

    @Override
    public String toString() {
        return "A Rectangle with width= "+getWidth()+" and length= "
                +getLength()+", Which is a subclass of "+super.toString()
                +" and Area "+getArea();
    }
}
