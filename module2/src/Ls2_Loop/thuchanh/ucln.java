package Ls2_Loop.thuchanh;

public class ucln {
    public static int UCLN(int a, int b){
        if(a>b){
            return UCLN(a-b,b);
        }
        else if(a<b){
            return UCLN(b-a,a);
        }
        else return a;
    }
    public static void main(String[] args) {
        System.out.println(UCLN(4,8));
    }
}
