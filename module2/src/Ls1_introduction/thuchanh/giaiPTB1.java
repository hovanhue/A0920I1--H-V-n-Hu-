package Ls1_introduction.thuchanh;
import java.util.Scanner;

public class giaiPTB1 {
    static void giaiptb1(double a, double b) {
        if (a != 0) {
            double answer = (-b) / a;
            System.out.printf("Equation pass with x = %f!\n", answer);
        } else {
            if (b == 0) {
                System.out.print("The solution is all x!");
            } else {
                System.out.print("No solution!");
            }
        }
    }

    public static void main(String[] args) {
        Scanner vh = new Scanner(System.in);
        double a, b;
        System.out.println("Nhập hệ số a:");
        a = vh.nextDouble();
        System.out.println("Nhập hệ số b:");
        b = vh.nextDouble();
        giaiptb1(a, b);
    }
}