package LinkedList;

import java.util.HashSet;
import java.util.Stack;

public class LinkedList {

    public Node head;

    public Node tail;

    public int size;

    public class Node{
        int value;
        Node next;

        public Node(int value){
            this.value = value;
        }
    }

    public void insertfirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size++;
    }

    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.print("END");
    }

    public void insertlast(int value){
        if(size == 0){
            insertfirst(value);
            return;
        }

        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    public int deletefirst(){
        if(size == 0){
            return -1;
        }

        int value = head.value;
        head = head.next;
        size--;
        return value;
    }

    public Node get(int index){
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void mid(){
        Node temp1 = head;
        Node temp2 = head;
        while (temp2.next != null && temp2.next.next != null){
            temp1 = temp1.next;
            temp2 = temp2.next.next;
        }
        System.out.println(temp1.value);
    }

    public void reverse(){
        reverse(head);
    }

    private void reverse(Node node){
        if(node == tail){
            head = tail;
            return;
        }
        reverse(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }

    public void kthappend(int k){   //list kth append clock wise
        if(k == 0){
            return;
        }
        Node current = head;
        int count = 1;
        while (count < k && current != null){
            current = current.next;
            count++;
        }

        if(current == null){
            return;
        }

        Node kthnode = current;

        while (current.next != null){
            current = current.next;
        }

        current.next =head;

        head = kthnode.next;

        kthnode.next = null;
    }

    public void kreverse(int k){
        this.head = kreverse(head, k);
    }

    private Node kreverse(Node head, int k){  //k reverse node of the linkedlist
        if(head == null){
            return null;
        }
        Node current = head;
        Node prev = null;
        int count = 0;

        while (count < k && current != null){
            Node temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
            count++;
        }
        head.next = kreverse(current, k);
        return prev;
    }

    public void detectloop(){   //detect loop in a linkedlist
        Node slow = head;
        Node fast = head;
        int flag = 0;
        while (slow != null && fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                flag = 1;
                break;
            }
        }
        if(flag == 1){
            System.out.println("Loop found");
        }
        else {
            System.out.println("Not found");
        }
    }

    public void detectandremoveloop(){    //detect and remove loop from ll
        Node slow = head;
        Node fast = head;
        while(slow != null && fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                removeloop(slow, fast);
                return;
            }
        }
        return;
    }

    public void removeloop(Node loop, Node curr){
        Node ptr1 = null;
        Node ptr2 = null;
        ptr1 = curr;
        while (true){
            ptr2 = loop;
            while (ptr2.next != loop && ptr2.next != ptr1){
                ptr2 = ptr2.next;
            }
            if(ptr2.next == ptr1){
                break;
            }
            ptr1=ptr1.next;
        }
        ptr2.next = null;
    }

    public int kthlast(int k){   //Nth node from end of linked list
        Node slow = head;
        Node fast = head;
        for (int i = 0; i <k ; i++) {
            fast = fast.next;
        }
        while (fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow.value;
    }

    public LinkedList merge(LinkedList L1, LinkedList L2){   //merge two linkedlist
        LinkedList newlist = new LinkedList();
        Node First = L1.head;
        Node Second = L2.head;
        while (First != null && Second != null){
            if(First.value < Second.value){
                newlist.insertlast(First.value);
                First=First.next;
            }
            else {
                newlist.insertlast(Second.value);
                Second = Second.next;
            }
        }
        while(First != null){
            newlist.insertlast(First.value);
            First = First.next;
        }
        while (Second!= null){
            newlist.insertlast(Second.value);
            Second = Second.next;
        }
        return newlist;
    }

    public Node intersection(LinkedList L1, LinkedList L2){
        Node n1 = L1.head;
        Node n2 = L2.head;
        HashSet<Node> hs = new HashSet<>();
        while(n1 != null){
            hs.add(n1);
            n1 = n1.next;
        }
        while (n2 != null){
            if(hs.contains(n2)){
                return n2;
            }
            n2 = n2.next;
        }
        return null;
    }

    public void sortlist(){    //0's, 1's and 2's sort in the linkedlist
        int[] count ={0,0,0};
        Node temp = head;
        while(temp != null){
            count[temp.value]++;
            temp = temp.next;
        }

        int i =0;
        temp = head;
        while( temp != null){
            if(count[i]  == 0){
                i++;
            }
            else {
                temp.value = i;
                --count[i];
                temp = temp.next;
            }
        }
    }

    public boolean pallindrome(){
        return pallindrome(this.head);
    }

    private boolean pallindrome(Node head){
        Node slow = head;
        boolean ispalli = true;
        Stack<Integer> stack = new Stack<>();
        while( slow != null){
            stack.push(slow.value);
            slow = slow.next;
        }
        while (head != null){
            int value = stack.pop();
            if(value == head.value){
                ispalli = true;
            }
            else {
                ispalli = false;
                break;
            }
            head = head.next;
        }
        return ispalli;
    }
}
