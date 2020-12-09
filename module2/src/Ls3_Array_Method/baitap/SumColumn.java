package Ls3_Array_Method.baitap;

import java.util.Scanner;

public class SumColumn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};// dòng cột
        int n, sum=0;
        System.out.println("Nhập cột bạn muốn tính: ");
        n = scanner.nextInt();
        for (int i=0;i<a.length;i++){
            sum+=a[i][n-1];
        }
        System.out.println(sum);
    }
}
