package StacksAndQueues.stackAndQueseQuestions;


import java.util.Stack;

// Implement Queue using stack (Leet Code) -- https://leetcode.com/problems/implement-queue-using-stacks/description/
public class ImplementQueueViaStack {
    public static void main(String[] args) {
        //  QueueUsingStack queueUsingStack = new QueueUsingStack();
        QueueUsingStack1 queueUsingStack = new QueueUsingStack1();
        queueUsingStack.push(2);
        queueUsingStack.push(4);
        queueUsingStack.push(6);
        queueUsingStack.push(8);

        System.out.println("All data = " + queueUsingStack.getAllItems());
        System.out.println("removed = " + queueUsingStack.pop());
        System.out.println("All data after removed = " + queueUsingStack.getAllItems());
        System.out.println("Peek = " + queueUsingStack.peek());
        System.out.println("Peek = " + queueUsingStack.empty());
    }
}

// insertion efficient (insert data into stack will O(1)), but removal is O(n)
class QueueUsingStack {

    private final Stack<Integer> first;
    private final Stack<Integer> helper;

    public QueueUsingStack() {
        first = new Stack<>();
        helper = new Stack<>();
    }

    public void push(int item) {
        first.push(item);
    }

    public int pop() {
        while (!first.isEmpty()) {
            helper.push(first.pop());
        }

        int removed = helper.pop();

        while (!helper.isEmpty()) {
            first.push(helper.pop());
        }

        return removed;
    }

    public int peek() {
        while (!first.isEmpty()) {
            helper.push(first.pop());
        }

        int peeked = helper.peek();
        while (!helper.isEmpty()) {
            first.push(helper.pop());
        }
        return peeked;
    }

    public boolean empty() {
        return first.isEmpty();
    }

    public Stack<Integer> getAllItems() {
        return first;
    }
}

// Removal efficient (insert data into stack will O(n)), but removal is O(1)
class QueueUsingStack1 {

    private final Stack<Integer> first;
    private final Stack<Integer> helper;

    public QueueUsingStack1() {
        first = new Stack<>();
        helper = new Stack<>();
    }

    public void push(int item) {
        while (!first.isEmpty()) {
            helper.push(first.pop());
        }
        first.push(item);
        System.out.println("========== ");
        System.out.println("First = " + first);

        while (!helper.isEmpty()) {
            first.push(helper.pop());
        }
        System.out.println("second = " + helper);
        System.out.println("First again = " + first);
        System.out.println("sec again = " + helper);
    }

    public int pop() {
        return first.pop();
    }

    public int peek() {
        return first.peek();
    }

    public boolean empty() {
        return first.isEmpty();
    }

    public Stack<Integer> getAllItems() {
        return first;
    }
}

