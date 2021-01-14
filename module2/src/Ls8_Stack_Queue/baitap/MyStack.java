package Ls8_Stack_Queue.baitap;

import java.util.Stack;

public class MyStack {
    private int size, index;
    private int arr[];

    private void swap(){ // hoán đổi số nguyên dùng stack
        Stack<Integer> stack = new Stack<>();
        Integer arr[] = {3, 4, 5, 7, 2};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            stack.push(arr[i]);
        }

        while (!stack.isEmpty()){
            System.out.print(stack.pop() +" ");
        }
    }

    public MyStack(int size) {
        this.size = size;
        arr = new int[size];
    }

    public boolean isFull(){
        if (index == size)
            return true;
        return false;
    }

    public int getSize(){
        return this.index;
    }

    public boolean isEmpty(){
        if (index == 0){
            return true;
        }
        return false;
    }
    public void push(int element) {
        if(isFull())
            throw new StackOverflowError("Stack is full");
        arr[index] = element;
        index++;
    }

    public int pop()throws Exception {
        if (isEmpty())
            throw new Exception("Stack is null");
        return arr[--index];
    }




    public static void main(String[] args) throws Exception {
        /*
        int a[]={13,5,6,74,1};
        Stack stack = new Stack();

       for(int i=0;i<a.length;i++){
           stack.push(a[i]);
       }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() +" ");
        }
        */


//        MyStack stack = new MyStack(5);
//        stack.push(1);
//        stack.push(3);
//        stack.push(2);
//        stack.push(5);

//        while (!stack.isEmpty()) {
//            System.out.printf(" %d", stack.pop());
//        }
    }
}
