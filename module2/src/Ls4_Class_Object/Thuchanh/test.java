package Ls4_Class_Object.Thuchanh;

import java.util.Queue;
import java.util.LinkedList;

public class test {

    public static int max(int[] a) {
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    public static int countMax(int max) {
        int count = 0;
        while (max != 0) {
            max /= 10;
            count++;
        }
        return count;
    }

    public static void radixSort(int[] a) {
        int x, vt, d = 1;
        int max = max(a);
        int k = countMax(max);
        Queue q = new LinkedList();
        Queue []qq = new LinkedList[10];
        for (int i = 0; i < 10; i++) {
            qq[i] = new LinkedList();
        }
        for (int i = 0; i < a.length; i++) {
            q.add(a[i]);
        }
        for (int i = 0; i < k; i++) {
            while (!q.isEmpty()) {
                x = (int) q.remove();
                vt = (x / d) % 10;
                qq[vt].add(x);
            }
            for (int j = 0; j < 10; j++) {
                while (!qq[j].isEmpty()) {
                    x = (int) qq[j].remove();
                    q.add(x);
                }
            }
            d *= 10;
        }
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) q.remove();
        }
    }

    public static void main(String[] args) {
        int a[] = {1, 4, 999, 12, 23, 66, 54, 221, 345, 678, 900, 3123, 4550, 2222, 7658};
        radixSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);

        }
    }
}
