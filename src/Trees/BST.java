package Trees;

import java.util.*;

public class BST {
    public static void main(String[] args) {
        BST tree = new BST();
        tree.insert(6);
        tree.insert(7);
        tree.insert(4);
        tree.insert(5);
        tree.insert(3);

        BST tree2 = new BST();
        tree2.insert(8);
        tree2.insert(7);
        tree2.insert(4);
        tree2.insert(5);
        tree2.insert(3);

        //System.out.println(tree.structurallyidentical(tree.root, tree2.root));
        //System.out.println(tree.structural());
        //System.out.println(tree.height());
        //System.out.println(tree.maxPathSum());
        //System.out.println(tree.diameter());
        //tree.preorder();
        //tree.leftprint();
        //tree.isBST();
        //tree.spiralLevelOrder();
        tree.verticalOrderTraversal();
        //tree.topview();
       // tree.bottomview();
        //System.out.println(tree.lca(3,5).value);
        //tree.totalNodes();
        //tree.leafnode();

    }
    public Node root;

    public class Node{
        int value;
        Node left;
        Node right;

        public Node(int value){
            this.value = value;
        }
    }

    public void insert(int value){
        this.root = insert(this.root, value);
    }

    private Node insert(Node node, int value){
        if(node == null){
            return new Node(value);
        }

        if(node.value > value){
            node.left = insert(node.left, value);
        }
        else{
            node.right = insert(node.right, value);
        }
        return node;
    }

    public void preorder(){
        preorder(root, "");
    }

    private void preorder(Node node, String indent){
        if(node == null){
            return;
        }
        System.out.println(indent + node.value);
        preorder(node.left, indent + "\t");
        preorder(node.right, indent+"\t");
    }

    public void leftprint(){      //Left View of Binary Tree
        if(root == null){
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
         while (!queue.isEmpty()){
             Node temp = queue.remove();
             System.out.print(temp.value + " ");

             if(temp.left != null){
                 queue.add(temp.left);
             }
         }
    }

    public void isBST(){
        ArrayList list = new ArrayList();
        isBST(this.root, list);

    }
    public void isBST(Node node, ArrayList list){
        if(node == null){
            return;
        }
        isBST(node.left, list);
        list.add(node.value);
        isBST(node.right, list);
    }

    public void spiralLevelOrder(){   //spiral level order print
        if(root == null){
            return;
        }

        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();
        stack1.push(root);
        while((!stack1.isEmpty()) || (!stack2.isEmpty())){
            while (!stack1.isEmpty()){
                Node temp = stack1.pop();
                System.out.print(temp.value + " ");
                if(temp.left != null){
                    stack2.push(temp.left);
                }
                if(temp.right != null){
                    stack2.push(temp.right);
                }
            }
            while (!stack2.isEmpty()){
                Node temp = stack2.pop();
                System.out.print(temp.value + " ");
                if(temp.right != null){
                    stack1.push(temp.right);
                }
                if(temp.left != null){
                    stack1.push(temp.left);
                }
            }
        }
    }

    public class Obj{
        int value;
        Node node;
        public Obj(Node node, int value){
            this.node = node;
            this.value = value;
        }
    }

    public void verticalOrderTraversal(){ //vertical order traversal
        if(root == null){
            return;
        }

        TreeMap<Integer, ArrayList<Node>> disMap = new TreeMap<>();
        Queue<Obj> queue = new LinkedList<>();
        queue.add(new Obj(root, 0));
        while(!queue.isEmpty()){
            Obj ele = queue.remove();
            if(!disMap.containsKey(ele.value)){
                 disMap.put(ele.value, new ArrayList<>());
                 disMap.get(ele.value).add(ele.node);
            }
            else{
                disMap.get(ele.value).add(ele.node);
            }
            if(ele.node.left != null){
                queue.add(new Obj(ele.node.left, ele.value -1));
            }
            if(ele.node.right != null){
                queue.add(new Obj(ele.node.right, ele.value + 1));
            }
        }
        for (Integer dis: disMap.keySet()) {
            ArrayList<Node> nodeList = disMap.get(dis);
            for (int i = 0; i <nodeList.size() ; i++) {
                System.out.print(nodeList.get(i).value + " ");
            }
            System.out.println();
        }
    }

    public void topview(){  //top view of a binary tree
        if(root == null){
            return;
        }
        TreeMap<Integer, Node> disMap = new TreeMap<>();
        Queue<Obj> queue = new LinkedList<>();
        queue.add(new Obj(root, 0));
        while (!queue.isEmpty()){
            Obj ele = queue.remove();
            if(!disMap.containsKey(ele.value)){
                disMap.put(ele.value, ele.node);
            }
            if(ele.node.left != null){
                queue.add(new Obj(ele.node.left, ele.value - 1));
            }
            if(ele.node.right != null){
                queue.add(new Obj(ele.node.right, ele.value + 1));
            }
        }
        for (Integer dis: disMap.keySet()) {
            System.out.print(disMap.get(dis).value + " ");
        }
    }

    public void bottomview(){  //bottom view of tree
        if(root == null){
            return;
        }

        TreeMap<Integer, Node> disMap = new TreeMap<>();
        Queue<Obj> queue = new LinkedList<>();
        queue.add(new Obj(root, 0));
        while (!queue.isEmpty()){
            Obj ele = queue.remove();
            if(!disMap.containsKey(ele.value)){
                disMap.put(ele.value, ele.node);
            }
            else {
                disMap.replace(ele.value, ele.node);
            }
            if(ele.node.left != null){
                queue.add(new Obj(ele.node.left, ele.value - 1));
            }
            if(ele.node.right != null){
                queue.add(new Obj(ele.node.right, ele.value + 1));
            }
        }
        for (Integer dis: disMap.keySet()) {
            System.out.print(disMap.get(dis).value + " ");
        }
    }

    public Node lca(int p, int q){  //least common ancestor
        return lca(root, p, q);
    }

    private Node lca(Node node, int p, int q){
        if(node == null){
            return node;
        }

        if(p < node.value && q < node.value){
            return lca(node.left, p, q);
        }

        if(p > node.value && q > node.value){
            return lca(node.right, p, q);
        }
        return node;
    }

    public boolean structurallyidentical(Node node1, Node node2){
        if(node1 == null && node2 == null){
            return true;
        }

        if(node1 != null && node2 != null){
            return structurallyidentical(node1.left, node2.left) && structurallyidentical(node1.right, node2.right);

        }
        return false;
    }

    public boolean structural(){ //is tree mirror of the same tree
        return isMirror(root, root);
    }

    public boolean isMirror(Node node1, Node node2){
        if(node1 == null && node2 == null){
            return true;
        }

        if(node1 == null || node2 == null){
            return false;
        }

        return (node1.value == node2.value) && isMirror(node1.left, node2.right) && isMirror(node1.right, node2.left);
    }

    public int height(){
        return height(root);
    }

    public int height(Node node){ //height of a tree
        if(node == null){
            return 0;
        }
        return 1 + Math.max(height(node.left), height(node.right));
    }

    public int max_path_sum;

    public int maxPathSum(){    //maximum sum path of a tree
        return maxPathSum(root);
    }

    public int maxPathSum(Node root){
        max_path_sum = Integer.MIN_VALUE;
        pathSum(root);
        return max_path_sum;
    }

    public int pathSum(Node node){
        if(node == null){
            return 0;
        }
        int left = Math.max(0, pathSum(node.left));
        int right = Math.max(0, pathSum(node.right));
        max_path_sum = Math.max(max_path_sum, left + right + node.value);
        return Math.max(left,right) + node.value;
    }

    public int diameter(){
        return diameter(root);
    }

    public int diameter(Node node){
        if(node == null){
            return 0;
        }
        int current = 1 + height(node.left) + height(node.right);
        int max = Math.max(diameter(node.left), diameter(node.right));
        return Math.max(current, max);
    }

    public void totalNodes(){
        if(root == null){
            return;
        }
        int count = 0;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            Node temp = queue.poll();
            count++;
            if(temp.left != null){
                queue.add(temp.left);
            }
            if(temp.right != null){
                queue.add(temp.right);
            }
        }
        System.out.println(count);
    } //number of nodes in a tree

    public void leafnode(){
        if(root == null){
            return;
        }
        int count = 0;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            Node temp = queue.poll();
            if(temp.left == null && temp.right == null){
                count++;
            }
            if(temp.left != null){
                queue.add(temp.left);
            }
            if(temp.right != null){
                queue.add(temp.right);
            }
        }
        System.out.println(count);
    }
}
