package DSAPatterns.LinkedList;

public class DetectACycleInLinkedList {
    public static void main(String[] args) {
        Node head = new Node(1,new Node(2,new Node(3,new Node(6,new Node(4,new Node(5))))));
        Node cycleNode = head.next.next;

// Traverse to the last node
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

// Create cycle
        temp.next = cycleNode;
        System.out.println(detectACycle(head));
    }

    static boolean detectACycle(Node head) {
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) return true;
        }
        return false;
    }
}
