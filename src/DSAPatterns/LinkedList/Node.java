package DSAPatterns.LinkedList;

public class Node {
    int val;
    Node next;

    Node(){
        val = 0;
        next = null;
    }

    Node(int val){
        this.val = val;
        next = null;
    }

    Node(int val, Node next){
        this.val = val;
        this.next = next;
    }
}
