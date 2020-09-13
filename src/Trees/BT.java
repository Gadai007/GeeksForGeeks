package Trees;

import java.util.Scanner;
import java.util.Stack;

public class BT {
    public Node root;

    public class Node{
        int value;
        Node left;
        Node right;

        public Node(int value){
            this.value =value;
        }
    }

    public void insert(Scanner s){
        this.root = insert(s, this.root);
    }

    public Node insert(Scanner s, Node node){
        if(node == null){
            System.out.println("Enter the value of the node: ");
            int value = Integer.parseInt(s.nextLine());
            return new Node(value);
        }

        System.out.println("Enter the direction: ");
        String dir = s.nextLine();
        if(dir.equals("left")){
            node.left = insert(s,node.left);
        }
        if(dir.equals("right")){
            node.right = insert(s, node.right);
        }
        return node;
    }

    public void preorder(){
        preorder(this.root, "");
    }

    private void preorder(Node node, String indent){
        if(node == null){
            return;
        }
        preorder(node.left, indent + "\t");
        System.out.println(indent + node.value);
        preorder(node.right, indent + "\t");
    }

}
