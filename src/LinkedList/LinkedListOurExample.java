package LinkedList;

import LinkedList.ownLinkedList.LinkedListNew;

public class LinkedListOurExample {
    public static void main(String[] args) {
        LinkedListNew linkedList = new LinkedListNew();
        linkedList.add(22);
        linkedList.add(25);
        linkedList.add(40);
        linkedList.add(250);
//        linkedList.addFirst(39);
//        linkedList.addLast(29);
//        linkedList.add(2, 55);
        linkedList.getAllItems();
        System.out.println(" ");
        //  System.out.print("removeFirst = " + linkedList.removeFirst());
       // System.out.print("removeLast = " + linkedList.removeLast());
        System.out.print("removeAtIndex = " + linkedList.remove(2));
        linkedList.add(405);
//        linkedList.remove(2);
        linkedList.getAllItems();

        System.out.println(" ");
        System.out.println("Value first = " + linkedList.getFirst());
        System.out.println("Value last = " + linkedList.getLast());
        System.out.println("Size = " + linkedList.getSize());
    }
}
