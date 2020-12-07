package Ls1_introduction.thuchanh;
import java.util.Scanner;

public class checkLeapYear {
    private static boolean checkLeap(int year){
        if(year %4==0 && year %100==0 || year%400 ==0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner vh= new Scanner(System.in);
        int n;
        System.out.println("Nhập năm: ");
        n=vh.nextInt();
        if (checkLeap(n)){
            System.out.println("Đây la năm nhuận");
        }
        else {
            System.out.println("Không phải là năm nhuận");
        }
    }
}
