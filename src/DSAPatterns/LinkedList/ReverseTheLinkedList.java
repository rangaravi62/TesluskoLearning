package DSAPatterns.LinkedList;

public class ReverseTheLinkedList {
    public static void main(String... args) {
        Node head = new Node(1,new Node(2,new Node(3,new Node(4,new Node(5)))));

        Node prev = null;
        Node front = null;
        Node temp = head;

        while (temp != null){
            front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }

        head = prev;

        Node temp1 = head;
        while (temp1 != null){
            System.out.println(temp1.val);
            temp1 = temp1.next;
        }

    }
}
