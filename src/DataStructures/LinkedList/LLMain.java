package DataStructures.LinkedList;

public class LLMain {
    public static void main(String[] args) {
        LinkedListImple ll = new LinkedListImple();
        ll.insertAtFirst(5);
        ll.insertAtFirst(4);
        ll.insertAtFirst(3);
        ll.insertAtEnd(7);
//        ll.show();
//        ll.deleteAtFirst();
//        ll.show();
//        ll.deleteAtEnd();
        ll.show();
        ll.insertAtPos(4,8);
        ll.show();
        System.out.println(ll.length());
        ll.deleteAtPos(5);
        ll.show();
    }
}
