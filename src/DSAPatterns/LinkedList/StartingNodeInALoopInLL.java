package DSAPatterns.LinkedList;

import java.util.HashMap;
import java.util.Map;

public class StartingNodeInALoopInLL {
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
        System.out.println(startingNodeInALoop(head).val);
    }

    // TC -> O(N) SC -> O(N)
    static Node startingNodeInALoop(Node head){
        Map<Node,Integer> map = new HashMap<>();

        Node temp = head;

        while (temp != null) {
            if(map.containsKey(temp)) {
                return temp;
            }

            map.put(temp,1);
            temp = temp.next;
        }

        return null;
    }
}
