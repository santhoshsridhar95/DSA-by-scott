package datastructure.linkedlist;

public class LinkedList {
    Node head;
    Node tail;
    int length;


    public LinkedList(int value) {
        Node newNode = new Node(value);
        this.head = newNode;
        this.tail = newNode;
        this.length = 1;
    }

    static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

   public void getLength(){
        System.out.println("length is " + length);
    }

    public void getHead() {
        System.out.println("Head is " + head.value);
    }

   public void getTail() {
       System.out.println("tail is " + tail.value);
   }
}
