package datastructure.linkedlist;

public class MainLinkedList {

    public static void linkedList() {
        LinkedList myLinkedList = new LinkedList(4);

//        myLinkedList.getHead();
//        myLinkedList.getTail();
//        myLinkedList.getLength();

        System.out.println("-----Appending last nodes--------");
        myLinkedList.append(33);
        myLinkedList.prepend(55);
        myLinkedList.append(7);
        myLinkedList.printList();

        System.out.println("-----Getting nodes on index--------");
        System.out.println(myLinkedList.get(2).value);

        System.out.println("-----setting nodes on index--------");
        System.out.println(myLinkedList.set(2,100));

        myLinkedList.printList();

        System.out.println("-----Removing last nodes--------");
        System.out.println(myLinkedList.removeLast().value);
        System.out.println(myLinkedList.removeLast().value);
        System.out.println(myLinkedList.removeLast().value);
        System.out.println(myLinkedList.removeLast().value);
        System.out.println(myLinkedList.removeLast());

        System.out.println("-----Prepending nodes--------");
        myLinkedList.prepend(4);
        myLinkedList.prepend(33);
        myLinkedList.printList();

        System.out.println("-----Remove First--------");
        System.out.println(myLinkedList.removeFirst().value);


        System.out.println("-----Insert--------");
        System.out.println(myLinkedList.insert(0,1));
        System.out.println(myLinkedList.insert(1,44));
        System.out.println(myLinkedList.insert(3,22));
        System.out.println(myLinkedList.insert(5,100));
        System.out.println(myLinkedList.insert( 0,2));
        System.out.println(myLinkedList.insert(5,100));


        System.out.println("-----Printing the Insert--------");
        myLinkedList.printList();


    }
}
