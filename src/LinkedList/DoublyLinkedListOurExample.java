package LinkedList;

import LinkedList.ownLinkedList.DoublyLinkedListNew;

public class DoublyLinkedListOurExample {

    public static void main(String[] args) {

        DoublyLinkedListNew doublyLinkedListNew = new DoublyLinkedListNew();
        doublyLinkedListNew.addFirst(55);
        doublyLinkedListNew.addFirst(54);
        doublyLinkedListNew.addFirst(57);
//        doublyLinkedListNew.addLast(578);
        doublyLinkedListNew.addFirst(58);
        doublyLinkedListNew.addFirst(59);
        doublyLinkedListNew.add(2, 50);
        doublyLinkedListNew.getAllItems();
        // doublyLinkedListNew.getAllItemsInReverse();

        //  System.out.println("remove first = " + doublyLinkedListNew.removeFirst());
        // System.out.println("remove last = " + doublyLinkedListNew.removeLast());
        System.out.println("remove at index = " + doublyLinkedListNew.remove(2));
        doublyLinkedListNew.getAllItems();
        System.out.println("Value first = " + doublyLinkedListNew.getFirst());
        System.out.println("Value last = " + doublyLinkedListNew.getLast());
        System.out.println("Size = " + doublyLinkedListNew.getSize());

    }
}
