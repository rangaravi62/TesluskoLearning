package DataStructuresMain.DoublyLinkedList;

public class DLLTest {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> dll = new DoublyLinkedList<>();
        dll.insertAtStart(5);
        dll.insertAtStart(6);
        dll.revPrintLL();
        dll.printLL();
        dll.insertAtEnd(7);
        dll.insertAtEnd(10);
        dll.printLL();
        dll.insertAtPos(4,5);
        dll.printLL();
        dll.revPrintLL();
        dll.deleteAtStart();
        dll.deleteAtStart();
        dll.printLL();
        dll.deleteAtEnd();
        dll.printLL();
        dll.insertAtEnd(45);
        dll.insertAtEnd(10);
        dll.printLL();

        dll.deleteAtPos(3);
        dll.printLL();
        dll.deleteAtPos(3);
        dll.printLL();
        dll.deleteAtPos(1);
        dll.printLL();
        dll.deleteAtPos(1);
        dll.printLL();

    }
}
