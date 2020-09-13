package StackAndQueue;

import java.util.Stack;

public class SortStack {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(9);
        stack.push(-1);
        stack.push(120);
        stack.push(4);
        System.out.println(stack);
        sort(stack);
        System.out.println(stack);

    }
    public static void sort(Stack<Integer> stack){
        if(stack.isEmpty()){
            return;
        }
        int temp = stack.pop();
        sort(stack);
        insertElement(stack, temp);
    }

    private static void insertElement(Stack<Integer> stack, int temp) {
        if(stack.isEmpty() || stack.peek() < temp){
            stack.push(temp);
            return;
        }

        int topEle = stack.pop();
        insertElement(stack, temp);
        stack.push(topEle);
    }
}
