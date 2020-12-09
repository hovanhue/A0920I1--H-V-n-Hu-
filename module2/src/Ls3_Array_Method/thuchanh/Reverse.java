package Ls3_Array_Method.thuchanh;

import java.util.Scanner;

public class Reverse {

    public static void daoNguoc(int a[]) {
        for (int i = 0; i < a.length / 2; i++) {
            int temp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - i - 1] = temp;
        }
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "");
        }
    }

    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size does not exceed 20");
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println("Mảng bạn vừa nhập là: ");
        for (i = 0; i < array.length; i++) {
            System.out.print(array[i] + "");
        }
        System.out.println("Đảo ngược lại: ");
        daoNguoc(array);
    }
}
