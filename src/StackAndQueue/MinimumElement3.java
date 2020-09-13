package StackAndQueue;

import java.util.Stack;

public class MinimumElement3 {
    public static void main(String[] args) {
        MinimumElement3 example = new MinimumElement3();
        example.pushele(3);
        example.pushele(2);
        example.pushele(1);
        example.pushele(9);
        example.pushele(2);
        System.out.println(example.stack);
        System.out.println(example.minstack);
        example.pople();
        example.pople();
        System.out.println(example.stack);
        System.out.println(example.minstack);
        System.out.println(example.minele());
    }
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minstack = new Stack<>();

    public void pushele(int data){
        int min = data;
        if(!stack.isEmpty() && min > minstack.peek()){
            min = minstack.peek();
        }
        stack.push(data);
        minstack.push(min);
    }
    public void pople(){
        stack.pop();
        minstack.pop();
    }

    public int minele(){
      return minstack.peek();
    }
}
