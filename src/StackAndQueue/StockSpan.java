package StackAndQueue;

import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) {
        StockSpan stock = new StockSpan();
        stock.next(100);
        stock.next(80);
        stock.next(60);
        stock.next(70);
        stock.next(60);
        stock.next(75);
        stock.next(85);
    }

    Stack<Integer> stackPrice = new Stack<>();
    Stack<Integer> stackCount = new Stack<>();

    public void next(int price){
        int count = 1;
        while(!stackPrice.isEmpty() && stackPrice.peek() <= price){
            stackPrice.pop();
            count = count + stackCount.pop();
        }

        stackPrice.push(price);
        stackCount.push(count);

        System.out.println(count);
    }
}
