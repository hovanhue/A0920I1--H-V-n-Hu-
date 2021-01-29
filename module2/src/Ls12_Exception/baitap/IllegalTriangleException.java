package Ls12_Exception.baitap;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IllegalTriangleException {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a;
        int b;
        int c;
        try {
            System.out.print("Nhap a: ");
            a = scanner.nextInt();
            System.out.print("Nhap b: ");
            b = scanner.nextInt();
            System.out.print("Nhap c: ");
            c = scanner.nextInt();

            if (a < 0 || b < 0 || c < 0 || a + b < c || a + c < b || b + c < a) {
                System.out.println("Bạn nhập không phải là 3 cạnh của tam giác");
            }
            else {
                System.out.println("Đây là cạnh của tam giác");
            }
        } catch (InputMismatchException e) {
            System.out.println("Ban phai nhap so");
        } catch (Exception e) {
            System.out.println("Ban nhap khong dung");
        }
    }
}
