package Ls4_Class_Object.Thuchanh;

import java.util.Scanner;

public class QuadraticEquation {
    private int a, b, c;

    public QuadraticEquation() {
        this.a = 1;
        this.b = 1;
        this.c = 1;
    }

    public QuadraticEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
// delta
    public double getDiscriminant() {
        return Math.pow(this.b, 2) - 4 * this.a * this.c;
    }

    // nghiệm thứ 1(delta >0)
    public double getRoot1() {
        return (-this.b + Math.sqrt(this.getDiscriminant())) / 2 * this.a;
    }
// nghiệm thứ 2(delta >0)
    public double getRoot2() {
        return (-this.b - Math.sqrt(this.getDiscriminant())) / 2 * this.a;
    }
//delta =0, x1=x2
    public double getRoot3(){
        return -this.b/(2*this.a);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuadraticEquation quadraticEquation = new QuadraticEquation();
        System.out.println("input a: ");
        quadraticEquation.a = scanner.nextInt();
        System.out.println("input b: ");
        quadraticEquation.b = scanner.nextInt();
        System.out.println("input c: ");
        quadraticEquation.c = scanner.nextInt();

        if (quadraticEquation.getDiscriminant() > 0) {
            System.out.println("The equation has two solutions: x1 = "+quadraticEquation.getRoot1()+"\tx2 = "+quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("The equation has one solution: x1 = x2= "+quadraticEquation.getRoot3());
        } else {
            System.out.println("The equation has no roots");
        }
    }
}
