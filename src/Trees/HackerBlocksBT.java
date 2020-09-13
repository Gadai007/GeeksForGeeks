package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class HackerBlocksBT {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    HackerBlocksBT blocks = new HackerBlocksBT();
    BinaryTree tree = blocks.new BinaryTree(sc);
    tree.rightView();
    }
    public class BinaryTree{
        Node root;

        public class Node{
            int value;
            Node left;
            Node right;

            public Node(int value){
                this.value = value;
            }
        }

        public BinaryTree(Scanner s){
            this.root = takeinput(s);
        }

        public Node takeinput(Scanner s){
            Queue<Node> q = new LinkedList<>();
            int value = s.nextInt();
            Node node = new Node(value);
            if(value != -1){
                q.add(node);
            }

            while (!q.isEmpty()){
                Node temp = q.poll();
                value = s.nextInt();
                if(value != -1){
                    temp.left = new Node(value);
                    q.add(temp.left);
                }
                value = s.nextInt();
                if(value != -1){
                    temp.right = new Node(value);
                    q.add(temp.right);
                }
            }
            return node;
        }

        public void rightView(){
            if(root == null){
                return;
            }
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);

            while (!queue.isEmpty()){
                Node temp = queue.remove();
                System.out.println(temp.value + " ");
                if(temp.right != null){
                    queue.add(temp.right);
                }
            }
        }
    }
}
