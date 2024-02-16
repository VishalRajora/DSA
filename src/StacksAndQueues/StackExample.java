package StacksAndQueues;

import java.util.Arrays;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(24);
        stack.push(242);
        stack.push(241);
        stack.push(242);
        stack.push(2444);
        stack.push(245);

        System.out.println("stack data = " + stack);

        System.out.println("item1 removed = " + stack.pop());
        System.out.println("item2 removed = " + stack.pop());
        System.out.println("item3 removed = " + stack.pop());
        System.out.println("item4 removed = " + stack.pop());
        System.out.println("item5 removed = " + stack.pop());
        System.out.println("item6 removed = " + stack.pop());
       // System.out.println ("item7 = " + stack.pop());
    }
}
