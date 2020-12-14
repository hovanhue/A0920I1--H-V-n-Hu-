package Ls5_Ke_Thua.thuchanh;

public class Rectangle  extends Shape{
    protected double length;
    protected double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Rectangle(double length, double width){
        super();
        setLength(1);
        setWidth(1);
    }

    public Rectangle(String color, boolean filled, double length, double width) {
        super(color, filled);
        if(this.length<0){
            this.length=1;
        }
        else {
            this.length = length;
        }
        if (this.width<0) {
            this.width = 1;
        }
        else {
            this.width = width;
        }
    }


    public String toString(){
        return "A Rectangle with width= "
                + getWidth()
                + " and heigh= "
                + getLength()
                + ", which is a subclass of "
                + super.toString();
    }

    public double getArea(){
        return this.length*this.width;
    }

    public double getPerimetor(){
        return (this.length+this.width)*2;
    }

    public static void main(String[] args) {
        Rectangle rectangle =new Rectangle(3,4);
        System.out.println(rectangle.toString());
        System.out.println("Diện tích: "+rectangle.getArea());
        System.out.println("Chu vi: "+rectangle.getPerimetor());
    }
}
