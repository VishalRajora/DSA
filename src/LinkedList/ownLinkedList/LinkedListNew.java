package LinkedList.ownLinkedList;

public class LinkedListNew {

    private Node head;
    private Node tail;

    private int size;

    public LinkedListNew() {
        size = 0;
    }

    public boolean add(int i) {
        Node newNode = new Node(i);
        newNode.next = head;
        head = newNode;

        if (tail == null) {
            tail = head;
        }
        size++;
        return true;
    }

    public void addLast(int i) {
        if (tail == null) {
            add(i);
        } else {
            Node newNoid = new Node(i);
            tail.next = newNoid;
            tail = newNoid;
            size++;
        }
    }

    public void addFirst(int i) {
        add(i);
    }

    public int getFirst() {
        return head.value;
    }

    public int getLast() {
        return tail.value;
    }

    public void getAllItems() {
        Node temp = head;
        System.out.println(" ");
        while (temp != null) {
            System.out.print(temp.value + " => ");
            temp = temp.next;
        }
        System.out.print(" end");
    }

    public int getSize() {
        return size;
    }

    public void add(int index, int element) {
        if (index == 0) {
            addFirst(element);
        } else if (index == size) {
            addLast(element);
        } else {
            Node temp = head;

            for (int i = 1; i < index; i++) {
                temp = temp.next;
            }
            temp.next = new Node(element, temp.next);
            size++;
        }
    }

    public int removeFirst() {
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }

        size--;
        return val;
    }

    public int removeLast() {
        if (size <= 1) {
            return removeFirst();
        }
        int value = tail.value;
        Node temp = get(size - 2);
        temp.next = null;
        tail = temp;
        size--;
        return value;
    }

    public int remove(int index) {
        if (index == 0) {
            return removeFirst();
        }

        if (index == size - 1) {
            return removeLast();
        }

        Node prev = get(index - 1);
        int value = prev.next.value;
        prev.next = prev.next.next;
        size--;
        return value;
    }

    public Node get(int index) {
        Node n = head;
        for (int i = 0; i < index; i++) {
            n = n.next;
        }
        return n;
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        public Node(int value) {
            this.value = value;
        }
    }

}
