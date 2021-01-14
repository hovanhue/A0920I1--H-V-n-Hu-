package Ls7_DSA_List.thuchanh;

public class MyLinkedList {
    Node head;
    int numNodes;

    public MyLinkedList(Object data) {
        head = new Node(data);
    }

    public class Node {
        Object data;
        Node next;

        public Node(Object data) {
            this.data = data;
            this.next = null;
        }

        public Object getData() {
            return this.data;
        }
    }

    public void add(int index, Object data){
        Node temp = head;
        Node holder;

        for(int i=0;i<index-1 &&temp.next != null;i++){
            temp=temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }

    public void addFirst(Object data){
        Node temp = head;
        head = new Node(data);
        head.next =temp;
        numNodes++;
    }
    public Object get(int index){
        Node temp = head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp;
    }
    public void display() {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
