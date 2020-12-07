package Ls3_Array_Method.thuchanh;

public class minMaxArray {

    public static int maxArray(int []a){
        int max = a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max = a[i];
            }
        }
        return max;
    }
    public static int minArray(int []a){
        int min = a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]<min){
                min = a[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int []aray ={1,2,3,4,5,6,7,88,12};
        System.out.println("Max: "+maxArray(aray));
        System.out.println("Min: "+minArray(aray));
    }
}
