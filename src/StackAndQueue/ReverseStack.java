package StackAndQueue;

import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
    Stack stack = new Stack();
    stack.push(4);
    stack.push(3);
    stack.push(2);
    stack.push(1);
    System.out.println(stack);
    reverse(stack);
    System.out.println(stack);
    }

    public static void reverse(Stack<Integer> stack){
        if(stack.isEmpty()){
            return;
        }

        int temp = stack.pop();
        reverse(stack);

        insertAtLast(stack, temp);
    }

    private static void insertAtLast(Stack<Integer> stack, int temp) {
        if(stack.isEmpty()){
            stack.push(temp);
            return;
        }

        int topEle = stack.pop();

        insertAtLast(stack, temp);

        stack.push(topEle);
    }
}
