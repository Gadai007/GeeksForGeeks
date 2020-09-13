package StackAndQueue;

import java.util.Stack;

public class MaximumElement {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> maxStack = new Stack();

    public void push(int value){
        int max = value;
        if(!maxStack.isEmpty() && max < maxStack.peek()){
            max = maxStack.peek();
        }
        stack.push(value);
        maxStack.push(max);
    }

    public void pop(){
        stack.pop();
        maxStack.pop();
    }

    public void max(){
        System.out.println(maxStack.peek());
    }

    public static void main(String[] args) {
        MaximumElement max = new MaximumElement();
        max.push(3);
        max.push(9);
        max.push(4);
        max.max();
    }
}
