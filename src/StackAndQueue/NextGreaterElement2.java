package StackAndQueue;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElement2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int i = 0; i <t ; i++) {
            int n = s.nextInt();
            int[] ar = new int[n];
            for (int j = 0; j <n ; j++) {
                ar[j] = s.nextInt();
            }
            nge(ar);
            System.out.println();
            nge2(ar);
        }
    }
    public static void nge(int[] ar){
        Stack<Integer> stack = new Stack<>();
         int[] arr = new int[ar.length];
        for (int i = ar.length-1; i >= 0 ; i--) {
            while(!stack.isEmpty() && stack.peek() <= ar[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                arr[i] = -1;
            }
            else {
                arr[i] = stack.peek();
            }
            stack.push(ar[i]);
        }

        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void nge2(int[] ar){
        int[] arr = new int[ar.length];
        Arrays.fill(arr, -1);
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i <ar.length ; i++) {
            while(!stack.isEmpty() && ar[stack.peek()] <= ar[i]){
                arr[stack.pop()] = ar[i];
            }
            stack.push(i);
        }

        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
