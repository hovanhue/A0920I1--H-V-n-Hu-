package Ls7_DSA_List.thuchanh;

import java.util.Arrays;

public class MyList<E> {
    private int size;
    private int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity){
        elements = new Object[capacity];
    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(E e) {
        if (size == elements.length)
            ensureCapa();
        elements[size++] = e;
    }

    public E get(int item) {
        if (item >= size || item < 0)
            throw new IndexOutOfBoundsException("Index: " + item + ", Size " + item);
        return (E) elements[item];
    }

    public static void main(String[] args) {

    }
}
