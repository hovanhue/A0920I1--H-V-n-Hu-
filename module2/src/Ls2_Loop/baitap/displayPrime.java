package Ls2_Loop.baitap;

import java.util.Scanner;

public class displayPrime {

    public static boolean checkNguyenTo(int n) {
        if (n <= 2) {
            return true;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0)
                    return false;
            }
        }
        return true;
    }

    public static void displayNguyenTo(int n) {
        for (int i = 1; i < n; i++) {
            if (checkNguyenTo(i)) {
                System.out.print(" " + i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhập n: ");
        n = sc.nextInt();
        displayNguyenTo(n);

    }
}
