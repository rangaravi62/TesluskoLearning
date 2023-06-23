package DataStructuresMain.LinkedList;

public class LLTest {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.insertEleAtStart(5);
        ll.insertEleAtEnd(4);
        ll.insertEleAtEnd(3);
        ll.insertEleAtEnd(2);
        ll.insertEleAtEnd(1);
        ll.printLL();
        ll.insertAtPos(3,10);
        ll.printLL();
        ll.deleteAtStart();
        ll.printLL();
        ll.deleteAtEnd();
        ll.printLL();
        ll.deleteAtPos(3);
        ll.printLL();
    }
}
