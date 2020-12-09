package Ls3_Array_Method.thuchanh;

import java.util.Scanner;

public class tesst {
    public static long largestNumber(int n){
        long result =0;
        for(int i=0;i<n;i++){
            result=result*10+9;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.println("nhap n:");
            n = scanner.nextInt();
            System.out.println(largestNumber(n));
        } while (n != 0);

    }
}
