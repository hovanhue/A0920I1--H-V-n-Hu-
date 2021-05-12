public class test {

    static int orderConsignment(int[] a, int[] t) {
        int sum = 0;
        int min = a[0];
        for(int i=0;i<a.length-1;i++) {
            if(a.length < 4 && min > a[i]) {
                a[i] = a[a.length-1];
                t[i] = t[t.length-1];
            }
        }
        System.out.println(a[a.length-1]);
        for (int i=0;i<a.length;i++){
            sum+=a[i];
        }
        if(a.length < 4){
            sum = sum - a[a.length-1];
        }
        return sum;
    }

    public static void main(String[] args) {
//        int []a = {4,1,11,6,13};
//        int []t = {2,3,6,6,5 };
        int []a = {10, 20,5,12};
        int []t = {2,3,3,1};
//        [10, 20, 5, 12],[2, 3, 3, 1]
        System.out.println(orderConsignment(a, t));
    }
}
