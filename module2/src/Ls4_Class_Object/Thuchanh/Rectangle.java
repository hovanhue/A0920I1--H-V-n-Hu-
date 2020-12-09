package Ls4_Class_Object.Thuchanh;

import java.util.Scanner;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle() {
        this.height = 1;
        this.width = 1;
    }

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public double getArea() {
        return this.height * this.width;
    }

    public double getPerimeter() {
        return (this.height + this.width) * 2;
    }

    public void display() {
        System.out.println("Diện tích là: " + this.getArea());
        System.out.println("Chu vi là: " + this.getPerimeter());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();
        System.out.println("Nhập chiều dài: ");
        rectangle.height = scanner.nextInt();
        System.out.println("Nhập chiều rộng: ");
        rectangle.width = scanner.nextInt();
        rectangle.display();
    }
}
