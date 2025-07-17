package datastructure.linkedlist;

public class MainLinkedList {

    public static void linkedList() {
        LinkedList myLinkedList = new LinkedList(4);

//        myLinkedList.getHead();
//        myLinkedList.getTail();
//        myLinkedList.getLength();

        myLinkedList.append(33);
        myLinkedList.append(7);
        myLinkedList.printList();

        System.out.println("-----removing last nodes--------");
        System.out.println(myLinkedList.removeLast().value);
        System.out.println(myLinkedList.removeLast().value);
        System.out.println(myLinkedList.removeLast());

    }
}
