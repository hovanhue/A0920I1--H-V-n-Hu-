package Ls5_Ke_Thua.thuchanh;

public class Triangle extends Shape {
    private double side1, side2, side3;

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public Triangle() {
        super();
        this.side1 = 1.0;
        this.side2 = 1.0;
        this.side3 = 1.0;
    }

    public Triangle(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getAreaTriangle() {
        double p = (this.side1 + this.side2 + this.side3) / 2;
        return Math.sqrt(p * (p - this.side1) * (p - this.side2) * (p - this.side3));
    }

    public double getPerimeter() {
        return this.side1 + this.side2 + this.side3;
    }

    public String toString(){
        String s="";
        s+="Chu vi: "+getPerimeter()+" Diện tích: "+getAreaTriangle()+""+super.toString();
        return s;
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle("red", true, 3, 4, 5);
        System.out.println(triangle.toString());

    }
}
