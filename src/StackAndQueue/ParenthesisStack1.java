package StackAndQueue;

import java.util.Scanner;
import java.util.Stack;

public class ParenthesisStack1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int i = 0; i < t; i++) {
            String str =s.next();
            if(parenthesis(str)){
                System.out.println("balanced");
            }
            else {
                System.out.println("not balanced");
            }
        }
    }
    public static boolean parenthesis(String s){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i <s.length() ; i++) {
            char ch = s.charAt(i);

            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }
            if(stack.isEmpty()){
                return false;
            }
            switch (ch){
                case ')':
                    stack.pop();
                    if(ch == '}' || ch == ']'){
                        return false;
                    }
                    break;
                case '}':
                    stack.pop();
                    if(ch == ')' || ch == ']'){
                        return false;
                    }
                    break;
                case ']':
                    stack.pop();
                    if(ch == '}' || ch == ')'){
                        return false;
                    }
                    break;
            }
        }
        return (stack.isEmpty());
    }
}
