package Ls3_Array_Method.baitap;

public class AggregationArray {
    public void aggregation(String[] a, String[] b) {
        String[] c = new String[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            c[a.length+i] = b[i];
        }
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + "");
        }
    }

    public static void main(String[] args) {
        String[] array1 = {"1", "2", "3", "4"};
        String[] array2 = {"5", "6", "7", "8"};
        AggregationArray aggregationArray = new AggregationArray();

        aggregationArray.aggregation(array1, array2);
    }
}
