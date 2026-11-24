package DSAPatterns.LinkedList;

public class MiddleOfALinkedList {
    public static void main(String[] args) {
        Node head = new Node(1,new Node(2,new Node(3,new Node(6,new Node(4,new Node(5))))));
        System.out.println(middleOfALinkedList(head).val);
    }

    static Node middleOfALinkedList(Node head) {
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

//        For the first middle node when even number of nodes are there
//        while (fast.next != null && fast.next.next != null) {
//            slow = slow.next;
//            fast = fast.next.next;
//        }

        return slow;
    }
}
