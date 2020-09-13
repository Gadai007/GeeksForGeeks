package StackAndQueue;

import java.util.Stack;

public class QueueUsingTwoStack {

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void enqueue(int value){
        stack1.push(value);
    }

    public void dequeue(){
        if(stack2.isEmpty()){
            if(stack1.isEmpty()){
                System.out.println("You have no element to dequeue");
            }
            else{
                while (!stack1.isEmpty()){
                    stack2.push(stack1.pop());
                }
            }
        }
        System.out.println(stack2.pop());
    }

    public static void main(String[] args) {
        QueueUsingTwoStack queue = new QueueUsingTwoStack();
        queue.enqueue(5);
        queue.enqueue(4);
        queue.enqueue(3);
        queue.enqueue(2);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
    }
}
