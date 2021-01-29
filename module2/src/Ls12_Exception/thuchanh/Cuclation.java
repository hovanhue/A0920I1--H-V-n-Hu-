package Ls12_Exception.thuchanh;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Cuclation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập x: ");
        int x = scanner.nextInt();
        System.out.println("Hãy nhập y: ");
        int y = scanner.nextInt();
        Cuclation calc = new Cuclation();
        calc.calculate(x, y);

    }

    private void calculate(int x, int y) {
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            double d = 1.0 * x / y;
            System.out.println("Tổng x + y = " + a);
            System.out.println("Hiệu x - y = " + b);
            System.out.println("Tích x * y = " + c);
            System.out.println("Thương x / y = " + d);
        }catch (InputMismatchException e){
            System.out.println("Bạn chỉ được nhập số");
        } catch (ArithmeticException e) {
            System.err.println("y phải khác 0");
        }
    }
}
