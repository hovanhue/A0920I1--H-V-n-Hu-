package Ls3_Array_Method.baitap;

public class AddItemsArray {
    private static int[] a;
    private static int n;

    public AddItemsArray(){
        a = new int[10];
        n = 0;
    }

    public void remove(int index) {
        if (index < 0 || index > a.length) {
            System.out.println("invalid index!");
        } else {
            for (int i = index; i < a.length-1; i++)
                a[i] = a[i + 1];
        }
    }

    public void add(int element) {
        //xet truong hop mang day,de tao mang day thanh mang chua day
        if (n == a.length) {
            int b[] = new int[a.length * 2];
            //chuyen cac phan tu o mang cu sang mang moi
            for (int i = 1; i < n; i++) {
                b[i] = a[i];
            }
            a = b;
        }
        //chen 1 phan tu element vao cuoi
        a[n] = element;
        n++;
    }


    public void addIndex(int index, int e) {
        if (index < 0 || index > n) {
            System.out.println(" invalid index! ");
        } else {
            if (n == a.length) add(e);
            for (int i = n; i > index; i--) {
                a[i] = a[i - 1];
            }
            a[index] = e;
            n++;
        }
    }

    public void display() {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        AddItemsArray a=new AddItemsArray();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.remove(1);
        a.display();
    }
}
