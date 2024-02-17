package LinkedList.ownLinkedList;

public class DoublyLinkedListNew {

    Node head;
    Node tail;

    int size;

    public DoublyLinkedListNew() {
        size = 0;
    }

    public void addFirst(int element) {
        Node node = new Node(element);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;

        if (tail == null) {
            tail = node;
        }
        size++;
    }

    public void addLast(int element) {
        Node newNode = new Node(element);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        }

        Node n = tail;
        n.next = newNode;
        newNode.prev = n;
        newNode.next = null;
        tail = newNode;
        size++;
    }

    public void add(int index, int element) {
        Node newNode = new Node(element);
        Node prev = get(index - 1);

        newNode.next = prev.next;
        prev.next = newNode;
        newNode.prev = prev;
        if (newNode.next != null) {
            newNode.next.prev = newNode;
        }
        size++;
    }

    public void getAllItems() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ==> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void getAllItemsInReverse() {
        Node temp = head;
        Node lastNode = null;
        while (temp != null) {
            lastNode = temp;
            temp = temp.next;
        }

        while (lastNode != null) {
            System.out.print(lastNode.value + " ==> ");
            lastNode = lastNode.prev;
        }
        System.out.println("START");
    }

    public int getFirst() {
        if (head != null) {
            return head.value;
        }
        return 0;
    }

    public int getLast() {
        if (tail != null) {
            return tail.value;
        }
        return 0;
    }

    public int getSize() {
        return size;
    }

    public int removeFirst() {
        int value = head.value;
        head = head.next;
        head.prev = null;
        size--;
        return value;
    }

    public int removeLast() {
        int value = tail.value;
        tail = tail.prev;
        tail.next = null;
        size--;
        return value;
    }

    public int remove(int index) {

        int val = get(index).value;
        Node pre = get(index - 1);
        pre.next = pre.next.next;
        //pre.next.next.prev = pre;
//
        return val;
    }

    private Node get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    private class Node {
        private Node next;
        private Node prev;
        private int value;

        public Node(int value) {
            this.value = value;
        }
    }
}
