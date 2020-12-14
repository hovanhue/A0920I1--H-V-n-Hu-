package Ls5_Ke_Thua.baitap;

public class Circle {
    protected double radius;
    protected String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle() {
        setRadius(0);
        setColor("Red");
    }

    public Circle(double radius,String color) {
        setRadius(radius);
        setColor(color);
    }

    public double getAreaCircle() {
        return Math.PI * this.radius * this.radius;
    }
    @Override
    public String toString(){
        return "A Circle with radius= "+ getRadius()+"and color: "+getColor() +"and Area: "+getAreaCircle();
    }
    public static void main(String[] args) {

    }

}
