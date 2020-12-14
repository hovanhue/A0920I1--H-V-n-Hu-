package Ls5_Ke_Thua.thuchanh;

public class Circle extends Shape {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle() {
        super();
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getAreaCircle() {
        return Math.PI * this.radius * this.radius;
    }

    public double getPerimeter(){
        return Math.PI*this.radius*2;
    }

    public String toString(){
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }
    public static void main(String[] args) {
//        Circle circle = new Circle();
//        circle.setRadius(4);
//        circle.setColor("Red");
//        System.out.println(circle.getAreaCircle());
//        System.out.println(circle.getPerimeter());
//        System.out.println(circle.toString());
        Circle circle2 = new Circle("Yellow", true, 6);
        System.out.println(circle2.toString());
    }
}
