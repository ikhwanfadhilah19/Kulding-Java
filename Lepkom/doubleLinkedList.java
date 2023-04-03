package Lepkom;

public class doubleLinkedList{
    private Node head; Node tail;
    private int length;

    private class Node{
        private int data;
        private Node next;

        public Node(int data){
            this.data = data;
        }
    }

    public doubleLinkedList(){
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public int length(){
        return length;
    }

    public void show(){
        if(head == null){
            return;
        }

        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " | ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void insert(int val){
        Node newNode = new Node(val);
        if(isEmpty()){
            tail = newNode;
        }
        newNode.next = head;
        head = newNode;
        length++;
    }

    public Node delete(){
        if(isEmpty()){
            System.out.println("Semua element telah dihapus!");
        }

        Node temp = head;
        if(head == tail){
            tail = null;
        }
        head = head.next;
        temp.next = null;
        length--;
        return temp;
    }

    public static void main(String[] args) {
        doubleLinkedList dlls = new doubleLinkedList();

        dlls.insert(100);
        dlls.insert(200);
        dlls.insert(300);

        dlls.show();

        dlls.delete();
        dlls.delete();

        dlls.show();
    }
}