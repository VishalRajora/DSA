package LinkedList;

import java.util.LinkedList;

public class DoublyLinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(22);
        linkedList.add(25);
        linkedList.add(26);
        linkedList.add(263);
//        linkedList.addLast(29);
//        linkedList.addFirst(39);
//        linkedList.add(0, 27);


        System.out.println("list = " + linkedList);
        System.out.println("list first = " + linkedList.getFirst());
        System.out.println("list last = " + linkedList.getLast());
        System.out.println("list Peek = " + linkedList.peek());
        System.out.println("list pop = " + linkedList.pop());
        System.out.println("list = " + linkedList);
        System.out.println("list poll = " + linkedList.poll());
        System.out.println("list = " + linkedList);

    }
}
