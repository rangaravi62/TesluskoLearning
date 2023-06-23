package DataStructures.DoublyLinkedList;

public class DLLMain {
    public static void main(String[] args) {
        DoublyLL dll = new DoublyLL();
        dll.insertAtStart(1);
        dll.insertAtStart(2);
        dll.insertAtStart(3);
        dll.show();
        dll.insertAtEnd(4);
        dll.insertAtEnd(5);
        dll.show();
        dll.revShow();

    }
}
