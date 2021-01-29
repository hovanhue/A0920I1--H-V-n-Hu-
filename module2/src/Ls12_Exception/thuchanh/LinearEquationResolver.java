package Ls12_Exception.thuchanh;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Linear Equation Resolver");
        System.out.print("a: ");
        double a = scanner.nextDouble();// 2.0
        System.out.print("b: ");
        double b = scanner.nextDouble();//10.0

        if (a != 0){
            double s = -b/a;
            System.out.printf("The solution is: %f!", s);
        } else {
            if (b == 0) {
                System.out.print("The solution is all x!");
            } else {
                System.out.print("No solution!");
            }
        }



    }
}
